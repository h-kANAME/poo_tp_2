package tp_poo;

import java.util.Random;

public class Sucursal {

	private boolean estadoSucursal;
	private int numeroSucursal;
	private String direccion;

	Random rnd = new Random();

	Sucursal(boolean estadoSucursal, int numeroSucursal, String direccion) {
		this.estadoSucursal = estadoSucursal;
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;

	}

	void accederSucursal() {

		estadoSucursal = rnd.nextBoolean();

		if (estadoSucursal == true) {
			System.out.println("Sucursal  Nº " + numeroSucursal + " abierta al publico");
		} else {
			System.out.println("La sucursal se encuentra cerrada");
		}

	}

}
