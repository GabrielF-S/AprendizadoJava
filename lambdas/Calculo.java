package lambdas;

public interface Calculo {
	
	public  double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String bemLoco() {
		return "bem louco";
	}
	

}
