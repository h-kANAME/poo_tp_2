package tp_poo;

import java.awt.dnd.DnDConstants;
import java.io.ObjectInputStream.GetField;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner in = new Scanner(System.in);

		Sucursal casaCentral = new Sucursal(true, "Forest", 1, "Forest 1500");
		ClienteEstandar emmanuel = new ClienteEstandar("Emmanuel", "Lopez", "18/06/90", 35233665, "Masculino", 1310,
				50000, 250, 150.000, 1234567890);

		// Clave cajero 1310
		// DNI 35233665

		RecepcionAutomatica autoGestion = new RecepcionAutomatica(true, 1, 22, 0);
		RecepcionManual gestionHumana = new RecepcionManual("Daniela", "Guzman", 14097951, 11000, 0);
		AtencionPersonalizada magdalena = new AtencionPersonalizada("Magdalena", "Carrizo", 35120759, 11);
		HomeBanking homeBanking = new HomeBanking();

		System.out
				.println("Para operar por Home Banking ingrese 1\nSi se dirige al Banco ingrese cualquier otro numero");

		int accionUsuario = in.nextInt();

		if (accionUsuario == 1) {

			boolean estadoDelServicio = homeBanking.isServicioActivo();
			if (estadoDelServicio == true) {

				System.out.println("Iniciando sesion en Home Banking\nPor favor ingrese su DNI");
				int dniIngresado = in.nextInt();
				System.out.println("Por favor ingrese su clave");
				int claveIngresada = in.nextInt();

				if (dniIngresado == 35233665 && claveIngresada == 1310) {
					System.out.println(
							"Inicio de sesion exitoso, por favor elija una opcion\nPor consulta de saldo ingrese 1\nPor compra de dolares ingrese 2\nPor venta de dolares ingrese 3\n");
					int accionHomeBanking = in.nextInt();

					switch (accionHomeBanking) {
					case 1:
						emmanuel.consultarSaldo(emmanuel);

						break;

					case 2:
						double tipoDeCambio = 85.5;
						System.out.println(
								"Usted ha decidido realizar una compra en dolares, el tipo de cambio a la fecha es: "
										+ tipoDeCambio + "\nPor favor ingrese la cantidad que desea comprar");
						
						double importeComprar = in.nextDouble();
						double comprobarSaldo = tipoDeCambio * importeComprar;
						System.out.println("Saldo en pesos actual de su cuenta: ARS " + emmanuel.getCuentaSueldo());
						System.out.println("Se descontaran de su cuenta: ARS " + comprobarSaldo);

						if (comprobarSaldo > emmanuel.getCuentaSueldo()) {
							System.out.println("No tiene saldo suficiente para comprar esa cantidad");
						} else {
							double saldoActualizadoEnPesos = emmanuel.getCuentaSueldo() - comprobarSaldo;
							System.out.println("Compra realizada con exito\nSaldo actual en dolares: "
									+ (emmanuel.getCuentaDolares() + importeComprar) + "\nSaldo en pesos: "
									+ saldoActualizadoEnPesos);
						}

					default:
						break;
					}

				} else {
					System.out.println("No ha podido iniciar sesion debido a que los datos ingresados son incorrectos");
				}

			} else {

				System.out
						.println("El servicio no se encuentra disponible en este momento, por favor intente mas tarde");

			}

		} else {

			casaCentral.estaAbieretaSucursal();

			if (casaCentral.getEstadoSucursal() == false) {
				System.out.println("La sucursal " + casaCentral.getnombreSucursal() + " (Nº" + casaCentral.getnumero()
						+ ") se encuentra cerrada.");

			} else {
				System.out.println("Bienvenido a sucursal " + casaCentral.getnombreSucursal() + " (Nº"
						+ casaCentral.getnumero() + ").");

				int accionCliente = rnd.nextInt(2);

				switch (accionCliente) {
				case 0:
					System.out.println("Usted ha decidido ingresar a zona comercial");

					int proceso = rnd.nextInt(2);

					if (proceso == 0) {
						System.out.println("Conozco proceso, me dirijo a Recepcion Automatico");

						autoGestion.pedirDni(null);

						if (autoGestion.getDniCliente() == emmanuel.getDni()) {
							emmanuel.consultarDatosPersonales(emmanuel);
							System.out.println("");
							System.out.println(
									"Por favor,ingrese una accion para conitnuar:\n Atencion Personalizada ingrese (1) \n Atencion Ventanilla ingrese (2)");

							String tipoDeAtencion = in.next();

							if (tipoDeAtencion.equalsIgnoreCase("1")) {
								System.out.println("Usted fue derivado a Atencion Personalizada, ¿Que desea realizar?");
								System.out.println(
										"Solicitar Prestamo, ingrese (1)\nCerrar Cuenta, ingrese (2)\nCambiar tipo de Cuenta. ingrese (3)\n");

							} else if (tipoDeAtencion.equalsIgnoreCase("2")) {
								System.out.println("Usted fue derivado a Atencion Ventanilla, ¿Que desea realizar?");
								System.out.println(
										"Hacer un deposito, ingrese (1)\nPagar Tarjeta, ingrese (2)\nVender moneda extranjera, ingrese (3)\nComprar moneda extranjera, ingrese (4)\n");

							} else {
								System.out.println("Accion definida inexistente");
							}

						} else {
							System.out.println(
									"DNI ingresado no pertenece a nuestra base de datos.\nSi desea abrir una cuenta ingrese (1)\nPara finalizar presione cualquier tecla");
							int accionCuenta = in.nextInt();
							if (accionCuenta == 1) {

								magdalena.recibirClientePotencial(magdalena);

							} else {
								System.out.println("Consulta finalizada");
							}
						}

					} else {
						System.out.println("No conozco proceso, solicito atencion Recepcionista");

						gestionHumana.pedirDni(null);

						if (gestionHumana.getDniCliente() == emmanuel.getDni()) {
							emmanuel.consultarDatosPersonales(emmanuel);
							System.out.println("");
							System.out.println(
									"Por favor,ingrese una accion para conitnuar:\n Atencion Personalizada ingrese (1) \n Atencion Ventanilla ingrese (2)");

							String tipoDeAtencion = in.next();

							if (tipoDeAtencion.equalsIgnoreCase("1")) {
								System.out.println("Usted fue derivado a Atencion Personalizada, ¿Que desea realizar?");
								System.out.println(
										"Solicitar Prestamo, ingrese (1)\nCerrar Cuenta, ingrese (2)\nCambiar tipo de Cuenta. ingrese (3)\n");

							} else if (tipoDeAtencion.equalsIgnoreCase("2")) {
								System.out.println("Usted fue derivado a Atencion Ventanilla, ¿Que desea realizar?");
								System.out.println(
										"Hacer un deposito, ingrese (1)\nPagar Tarjeta, ingrese (2)\nVender moneda extranjera, ingrese (3)\nComprar moneda extranjera, ingrese (4)\n");

							} else {
								System.out.println("Accion definida inexistente");
							}

						} else {
							System.out.println(
									"DNI ingresado no pertenece a nuestra base de datos.\nSi desea abrir una cuenta ingrese (1)\nPara finalizar presione cualquier tecla");
							int accionCuenta = in.nextInt();
							if (accionCuenta == 1) {

								magdalena.recibirClientePotencial(magdalena);

							} else {
								System.out.println("Consulta finalizada");
							}
						}

					}

					break;
				case 1:
					System.out.println("Usted ha decidido utilizar un Cajero Automatico");
					CajeroAutomatico atm = new CajeroAutomatico();

					boolean estado = atm.isActivo();

					if (estado = true) {
						System.out.print(
								"Cajero Activo \nSeleccione una opcion para continuar\n1) Consultar saldo\n2) Retirar Efectivo\n3)Depositar Cheque\n4)Hacer Transferencia\n5)Generar Clave Home Banking ");

						int opcion = in.nextInt();

						switch (opcion) {
						case 1:
							emmanuel.consultarSaldo(emmanuel);

							break;

						case 2:
							emmanuel.retirarSueldo(emmanuel);

							break;

						case 3:

							System.out.println("Cheque depositado con éxito");
							// emmanuel.depositarCheque(emmanuel);
							break;

						case 4:
							System.out.println("Su dinero fue depositado satisfactoriamente");
							// emmanuel.depositarEfectivo(emmanuel);
							break;

						case 5:
							atm.generarClaveHomeBanking(emmanuel);

							break;
						default:
						}

					} else {
						System.out.print("Cajero fuera de Servicio");
					}

				default:
					break;
				}

			}
		} // Agregue condicional para uso de HB
			//

	}
}
