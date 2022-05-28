package controle;


//Além do case destinado, executa também todos os case abaixo, o break evita que isto aconteça
//Switch não recebe um valor booleano, ele recebe um valor comum 
public class SwitchSemBreeak {
	public static void main(String[] args) {
		String faixa = "";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o  Bassai - Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "rosa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
		default:
			System.out.println("Não sei nada");

		}

	}

}
