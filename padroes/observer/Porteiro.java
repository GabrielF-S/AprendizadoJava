package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ChegadaAniversarianteObservador> obervadores = new ArrayList<>();
	
	
	
	public void registrarObservadores(ChegadaAniversarianteObservador observador ) {
		obervadores.add(observador);
	}
	
	public void monitorar() {
		Scanner input= new Scanner(System.in);
		String valor = "";
		
		while (!"sair".equalsIgnoreCase(valor)) {
			System.out.print("Aniverariante chegou?");
			
			valor = input.nextLine();
			
			if ("sim".equalsIgnoreCase(valor)) {
				//criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				//notificar os observadores
				obervadores.stream().forEach(o -> o.chegou(evento));
				valor= "sair";				
			}else {
				System.out.println("Alarme falso");
			}
			
		}
		
		input.close();
		
	}
}
