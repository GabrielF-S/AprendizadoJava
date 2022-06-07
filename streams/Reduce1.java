package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (ac, num) -> ac + num;
		
		Integer resultado1 = nums.stream().reduce(soma).get();
		System.out.println(resultado1);
		
		
		Integer resultado2 = nums.parallelStream().reduce(100, soma);
		System.out.println(resultado2);
		
		Integer resultado3 = nums.stream().reduce(100, soma);
		System.out.println(resultado3);
		
		
		
		nums.stream().filter(n-> n>5).reduce(soma).ifPresent(System.out::println);
				
	}

}
