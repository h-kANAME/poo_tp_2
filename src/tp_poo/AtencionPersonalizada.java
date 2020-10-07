package tp_poo;

import java.util.Random;

public class AtencionPersonalizada {

	private String nombre;
	private String apellido;
	private int dni;
	private int legajo;

	Random rnd = new Random();

	AtencionPersonalizada(String nombre, String apellido, int dni, int legajo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
	}

	void recibirTicker() {

		int ticket = rnd.nextInt(5);
		String tipoDeServicioBrindar;

		switch (ticket) {
		case 0:
			tipoDeServicioBrindar = "Otorgar Prestamo";
			System.out.println("Bienvenido, tu asesora " + nombre + " " + apellido +" te asesorará sobre la adquisición de un prestamo");

			break;

		case 1:
			tipoDeServicioBrindar = "Abrir Cuenta";
			System.out.println("Bienvenido, tu asesora " + nombre + " " + apellido +" te asesorará para llevar a cabo la apertura de cuenta en nuestra sucursal");
			break;

		case 2:
			tipoDeServicioBrindar = "Cerrar Cuenta";
			System.out.println("Bienvenido, tu asesora " + nombre + " " + apellido +" te asesorará sobre el cierre de tu cuenta");
			break;

		case 3:
			tipoDeServicioBrindar = "Cambiar tipo de Cuenta";
			System.out.println("Bienvenido, tu asesora " + nombre + " " + apellido +" te asesorará respecto los tipos de cuenta disponibles");
			break;

		case 4:
			tipoDeServicioBrindar = "Derivar atencion Ventanilla";
			System.out.println("Tu asesora " + nombre + " " + apellido +" te deriva para continuar la gestion en sector de ventanillas");
			break;

		default:

		}

	}

}
