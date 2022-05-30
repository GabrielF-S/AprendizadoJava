package oo.encapsulamento.casaA;

public class Ana {
	@SuppressWarnings("unused")
	private String segredo = "...";  //apenas a classe tem acesso
	String dentroDeCasa = "...."; //tem acesso quem esta no mesmo pacote
	protected String formaDeFalar = "..."; // tem acesso herança/ (generalização/especificação)
	public String todosSambem = "..."; // todos tem acesso
	
}
