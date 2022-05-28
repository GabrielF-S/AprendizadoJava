package fundamentos.Desafios.DesafioModuloFundamentos;

public class Fundamentos6 {
	public static void main(String[] args) {
		int a =1,b=12, c= -13;
		
		
		int delta = (b*b) - (4*a*c);
		
		//double delta  =( Math.pow(b, 2)) - (4 * a * c);
		
		System.out.println(delta);
		
		double x1 = (-b +  Math.sqrt(delta))/2*a;
		//double x1 = (-b + Math.sqrt(delta)) / 2*a;
		
		System.out.println("X1 = "+ x1);
		
		double x2 = (-b -  Math.sqrt(delta))/2*a;
		//double x2 = (-b - Math.sqrt(delta))/ 2*a;
		System.out.println("X2 = "+ x2);
	}


}
