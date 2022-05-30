package oo.heranca.desafio;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;
	
	
	protected Carro(int velocidade){
		VELOCIDADE_MAXIMA   = velocidade;
	}
	
	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else
			velocidadeAtual +=getDelta();
	}
	
	public void freiar() {
		if(velocidadeAtual>=5) {
			velocidadeAtual -= 5 ;
		}else {
			velocidadeAtual = 0;
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("A velocidade atual é de: %dKM/h", this.velocidadeAtual);
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	
	
	//velicidade atual
	
	//metodo acelerar e freiar, velocidade não pode ser menor que 0  5 em 5
	//ferrari acelera mais  15 em 15
	
}
