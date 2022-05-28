package fundamentos.Desafios;

public class desafioLogico {
	
	/*desafio logicos
	 * dois trabalhos a se confirmarem
	 * um terça outro quinta
	 * trabalho vai ser verdadeiro ou falso
	 * se os dois deram certo . compra um televisão 50 polegas
	 * se apenas só um der certo comprar tv de 30 polgas
	 * se comprar a TV tomar sorvete
	 * se for falso não sair de casa
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
			System.out.println("Os trabalhos não detram certo, sua familia não tomou sorvete");
		}else {
			System.out.println("Sua familia tomou sorvete porque você comprou uma tv de "+ televisao+" polegadas");
		}
	}   

}
