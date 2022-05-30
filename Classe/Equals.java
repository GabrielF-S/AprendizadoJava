package Classe;

public class Equals {
	public static void main(String[] args) {
		Usuario u1, u2;
		
		u1 = new Usuario();
		u1.nome="Gabriel";
		u1.email = "gabrielboni2008@homtial.com";
		
		u2 = new Usuario();
		u2.nome="Gabriel";
		u2.email = "gabrielboni2008@homtial.com";
		
		System.out.println(u1 ==u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//System.out.println(u2.equals(new Date()));
	}

}
  