package tp_poo;

public class ClientePremium {

	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private int dni;
	private String sexo;
	private int claveCajero;
	private int claveHomeBanking;
	private double cuentaSueldo;
	private int numeroDeTarjeta;
	private double millas;
	
	ClientePremium(String nombre, String apellido, String fechaDeNacimiento, int dni, String sexo, int claveCajero,
			int claveHomeBanking, double cuentaSueldo, int numeroDeTarjeta, double millas) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.claveCajero = claveCajero;
		this.claveHomeBanking = claveHomeBanking;
		this.cuentaSueldo = cuentaSueldo;
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.millas = millas;

	}

	

}
