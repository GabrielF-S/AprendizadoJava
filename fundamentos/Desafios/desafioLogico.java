package fundamentos.Desafios;

public class desafioLogico {
	
	/*desafio logicos
	 * dois trabalhos a se confirmarem
	 * um ter�a outro quinta
	 * trabalho vai ser verdadeiro ou falso
	 * se os dois deram certo . compra um televis�o 50 polegas
	 * se apenas s� um der certo comprar tv de 30 polgas
	 * se comprar a TV tomar sorvete
	 * se for falso n�o sair de casa
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean trabalhoTerca=false, trabalhoQuinta= true, tomarSorvete= false;
		int televisao=0;
		
		
		
		if(trabalhoTerca == true && trabalhoQuinta == true) {
			tomarSorvete = true;
			televisao =50;
		}else if(trabalhoTerca == true ^ trabalhoQuinta == true) {
			tomarSorvete = true;
			televisao =30;
		}
		if(!tomarSorvete ==true) {
			System.out.println("Os trabalhos n�o detram certo, sua familia n�o tomou sorvete");
		}else {
			System.out.println("Sua familia tomou sorvete porque voc� comprou uma tv de "+ televisao+" polegadas");
		}
	}   

}
