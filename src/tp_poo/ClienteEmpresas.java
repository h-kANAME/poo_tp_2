package tp_poo;

public class ClienteEmpresas {

	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private int dni;
	private String sexo;
	private int claveCajero;
	private int claveHomeBanking;
	private double cuentaSueldo;
	private int numeroDeTarjeta;
	private int seguroEmpresas;
	
	ClienteEmpresas(String nombre, String apellido, String fechaDeNacimiento, int dni, String sexo, int claveCajero,
			int claveHomeBanking, double cuentaSueldo, int numeroDeTarjeta, int seguroEmpresas) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.claveCajero = claveCajero;
		this.claveHomeBanking = claveHomeBanking;
		this.cuentaSueldo = cuentaSueldo;
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.seguroEmpresas = seguroEmpresas;

	}

}
