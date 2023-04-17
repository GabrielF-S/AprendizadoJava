package padroes.observer;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
				
		porteiro.registrarObservadores(namorada);
		
		porteiro.registrarObservadores(e -> System.out.println("Suspresa via Lambda as " + e.getMomento()));
	porteiro.monitorar();
	
	
	
	}

}
