package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
private String nomeDoAtributo;
	
	public StringVaziaException(String nome) {
		this.nomeDoAtributo = nome;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeDoAtributo);
	}

}
