package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservador{
	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados");
		System.out.println("Apagar luzez");
		System.out.println("Esperar um pouco");
		System.out.println("Surpresa!!!!");
	}

}
