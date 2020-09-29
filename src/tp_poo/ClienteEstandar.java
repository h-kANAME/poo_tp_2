package tp_poo;

public class ClienteEstandar {

	private int numeroDeTarjeta;
	private double cuentaSueldo;
	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private int dni;
	private String sexo;
	private int claveCajero;
	private int claveHomeBanking;

	private ClienteEstandar(int numeroDeTarjeta, double cuentaSueldo, String nombre, String apellido,

			String fechaDeNacimiento, int dni, String sexo, int claveCajero, int claveHomeBanking) {
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.cuentaSueldo = cuentaSueldo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.claveCajero = claveCajero;
		this.claveHomeBanking = claveHomeBanking;

	}

}
