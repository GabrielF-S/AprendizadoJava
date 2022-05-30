package oo.heranca;

public class Heroi extends Jogador{
	
	public Heroi(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x, y);
	}
	
	public boolean atacar(Jogador outro) {
		boolean ataque1 = super.atacar(outro);	
		boolean ataque2 = super.atacar(outro);
		if(ataque1 || ataque2 ) {
			return true;
		}
		return false;
	}
}
