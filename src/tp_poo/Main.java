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
				2020, 10.50, 50.000, 1234567890);

		RecepcionAutomatica autoGestion = new RecepcionAutomatica(true, 1, 22, 0);
		RecepcionManual gestionHumana = new RecepcionManual("Daniela", "Guzman", 14097951, 11000, 0);
		AtencionPersonalizada magdalena = new AtencionPersonalizada("Magdalena", "Carrizo", 35120759, 11);
		// Magdalena.recibirTicker();

		// Emmanuel.consultarDatosPersonales(Emmanuel);
		// System.out.println("");
		// Emmanuel.consultarSaldo(Emmanuel);
		// System.out.println("");
		// Emmanuel.retirarSueldo(Emmanuel);
		// Emmanuel.solicitarCredito(Emmanuel);
		// Emmanuel.invertidDinero(Emmanuel);
		// Emmanuel.usarTarjeta(Emmanuel);

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

			default:
				break;
			}

		}

	}
}
