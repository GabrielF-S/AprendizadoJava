package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro car1 = new Civic();
		
		
		
		Ferrari car2 = new Ferrari(400);
		
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		
		
		
		car2.ligarTurbo();
		car2.ligarAr();
		car2.acelerar();
		car2.desligarAr();
		//car2.ligarTurbo();
		car2.acelerar();
		//car2.desligarTurbo();
		car2.acelerar();
		car2.freiar();
		System.out.println(car1);
		System.out.println();
		System.out.println(car2);
		
		
		
	}
	

}
