package tp_poo;

import java.io.ObjectInputStream.GetField;
import java.rmi.server.UnicastRemoteObject;

public class Main {

	public static void main(String[] args) {

		ClienteEstandar Emmanuel = new ClienteEstandar("Emmanuel", "Lopez", "18/06/90", 35233665, "Masculino", 1310,
				2020, 10.50, 50.000, 1234567890);

		// Emmanuel.consultarDatosPersonales(Emmanuel);
		// System.out.println("");
		// Emmanuel.consultarSaldo(Emmanuel);
		// System.out.println("");
		// Emmanuel.retirarSueldo(Emmanuel);
		// Emmanuel.solicitarCredito(Emmanuel);
		// Emmanuel.invertidDinero(Emmanuel);

		Sucursal CasaCentral = new Sucursal(true, 1, "Forest 1500");
		// CasaCentral.accederSucursal();

		AtencionPersonalizada Magdalena = new AtencionPersonalizada("Magdalena", "Carrizo", 35120759, 11);
		Magdalena.recibirTicker();

	}
}
