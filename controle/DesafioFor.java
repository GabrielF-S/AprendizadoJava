package controle;

/**
 * N�o pode usar valor numerido para controlar um la�o
 * 
 * @author Gabriel F
 *
 */

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		// for(int i = 0;i <5; i++) {
		// System.out.println(valor);
		// valor+="#";
		// }

		for (valor = "#"; !valor.equals("######"); valor += "#") {
			System.out.println(valor);
		}

	}

}
