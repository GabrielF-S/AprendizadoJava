package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
private String nomeDoAtributo;
	
	public StringVaziaException(String nome) {
		this.nomeDoAtributo = nome;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' est� vazio", nomeDoAtributo);
	}

}
