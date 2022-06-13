package excecao;

public class ChecadaVSNaoChegada {
	
	public static void main(String[] args) {
		
		try {
			gerarErro1();
		} catch (RuntimeException e) {
			
			System.out.println(e.getMessage());
		}
		try {
			gerarErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
		
	}
	
	//Não verificada, não checada
	public static void gerarErro1() {
		throw new  RuntimeException("Ocorreu um erro bem legal #01");
	}
	//Checada, verificada 
	public static void gerarErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02");
		
	}

}
