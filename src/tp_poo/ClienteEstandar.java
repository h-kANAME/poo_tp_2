package tp_poo;

public class ClienteEstandar {

	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private int dni;
	private String sexo;
	private int claveCajero;
	private int claveHomeBanking;
	private int numeroDeTarjeta;
	private double cuentaSueldo;

	// Nota: Posibilidad de ejecutar un cambio dentro del constructor

	ClienteEstandar(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	void altaClienteEstandar(ClienteEstandar clienteEstandar) {
		System.out.println("Alta cliente realizada");
		System.out.println("Nombre Cliente: " + nombre);
		System.out.println("Apellido Cliente: " + dni);
	}

}
