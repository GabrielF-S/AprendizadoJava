package oo.heranca;

public class Jogador {
	public int vida = 100;
	public int x;
	public int y;
	

	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean atacar(Jogador outro) {
		int deltaX = Math.abs(this.x - outro.x);
		int deltaY = Math.abs(this.y - outro.y);
		
		if(deltaX == 0 || deltaY == 1) {
			outro.vida -=  10;
			return true;
		}
		else if(deltaX == 1 || deltaY == 0) {
			outro.vida -=  10;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE: 
			y++;
			break;
		case SUL:
			y--;
			break;
		case LESTE:
			x ++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Posição x: %d\nPosição Y: %d", this.x, this.y);
	}
}
	
	
