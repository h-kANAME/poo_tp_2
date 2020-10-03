package tp_poo;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String[] args) {

		ClienteEstandar Emmanuel = new ClienteEstandar("Emmanuel", "Lopez", "18/06/90", 35233665, "Masculino",1310,
				2020, 10.50, 1234567890);

		Emmanuel.consultarDatosPersonales(Emmanuel);
		System.out.println("");
		Emmanuel.consultarSaldo(Emmanuel);
		System.out.println("");
		Emmanuel.retirarSueldo(Emmanuel);

	}

}
