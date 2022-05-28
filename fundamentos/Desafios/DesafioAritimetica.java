package fundamentos.Desafios;

public class DesafioAritimetica {
	public static void main(String[] args) {
		int a=2, b=3, c= 5, d=7, e=1, f=10, g=6;
		double result;
		
		result= (          Math.pow(    ((Math.pow((g*(b+a)),a))/(b*a)) - Math.pow(((e-c)*(a-d))/a,a),b )          )/Math.pow(f, b);
		System.out.println(result);
	}

}
