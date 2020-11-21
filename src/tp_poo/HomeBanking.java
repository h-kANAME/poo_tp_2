package tp_poo;

import java.util.Random;

public class HomeBanking {

	private boolean sesionIniciada;
	private boolean servicioActivo;
	private int usuario;
	private int contraseña;

	Random rnd = new Random();

	public boolean isServicioActivo() {
		servicioActivo = rnd.nextBoolean();
		return servicioActivo;
	}

}
