package tp_poo;

import java.util.Random;
import javax.swing.JOptionPane;

public class CajeroAutomatico {

	private boolean activo;
	private int idCajero;
	private double saldoDisponible; // local

	Random rnd = new Random(10);

	public boolean isActivo() {
		activo = rnd.nextBoolean();
		return activo;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void generarClaveHomeBanking(ClienteEstandar clienteEstandar) {
		int generaClave = rnd.nextInt();

		System.out.print("Su nueva clave es: " + generaClave);
	}

}