package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMax) {
		super(velocidadeMax);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;

	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr= true;
		// TODO Auto-generated method stub

	}

	@Override
	public void desligarAr() {
		ligarAr = false;
		// TODO Auto-generated method stub

	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}
		return 15;
	}

	/***
	 * void acelerar() { super.acelerar(); }
	 */

}
