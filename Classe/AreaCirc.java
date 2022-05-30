package Classe;

public class AreaCirc {
	double raio;
	static final double PI = 3.14;
	
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
		
	}
	
	double Area() {
		return PI * Math.pow(raio, 2);
	}

}
