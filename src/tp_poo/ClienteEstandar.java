package tp_poo;

import java.util.Scanner;

public class ClienteEstandar {

	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private int dni;
	private String sexo;
	private int claveCajero;
	private int claveHomeBanking;
	private double cuentaSueldo;
	private int numeroDeTarjeta;

	Scanner in = new Scanner (System.in);
	
	ClienteEstandar(String nombre, String apellido, String fechaDeNacimiento, int dni, String sexo, int claveCajero,
			int claveHomeBanking, double cuentaSueldo, int numeroDeTarjeta) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.claveCajero = claveCajero;
		this.claveHomeBanking = claveHomeBanking;
		this.cuentaSueldo = cuentaSueldo;
		this.numeroDeTarjeta = numeroDeTarjeta;

	}

	void consultarDatosPersonales(ClienteEstandar clienteEstandar) {
		System.out.println("Datos del asociado:");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
		System.out.println("DNI: " + dni);
		System.out.println("Sexo: " + sexo);
		System.out.println("Numero de tarjeta: " + numeroDeTarjeta);
	}

	void retirarSueldo(ClienteEstandar clienteEstandar) { //Escenario cajero
		int claveIngresada;
		double importeExtraer;
		System.out.println("Ingrese su clave");
		claveIngresada = in.nextInt();
		
		if(claveIngresada == claveCajero) {
			System.out.println("Su saldo es de: ARS " + cuentaSueldo);
			System.out.print("Ingrese importe a retirar: ");
			importeExtraer = in.nextDouble();
			
			if(cuentaSueldo > importeExtraer) {
				System.out.println("Has retirado ARS " + importeExtraer + " satisfactoriamente");
				cuentaSueldo = cuentaSueldo - importeExtraer;
				System.out.println("Su saldo actual es de ARS " + cuentaSueldo);
			}else {
				System.out.println("IMPOSIBLE RETIRAR ESA CANTIDAD");
			}
			
		}else {
			System.out.println("CLAVE INCORRECTA");
			return;
		}
	}

	void consultarSaldo(ClienteEstandar clienteEstandar) {
		System.out.println("El saldo es de ARS: " + cuentaSueldo);
	}

}
