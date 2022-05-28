package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		Boolean bo = Boolean.parseBoolean("True");
		Float f = 1234.2F;
		
		System.out.println(f.byteValue());
		System.out.println(bo);
		
		double b = 6.777;
		
		int nota = (int) b;
		
		System.out.println(nota);
	}
}
