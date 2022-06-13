package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nome) {
		this.nomeDoAtributo = nome;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}
	
	

}
