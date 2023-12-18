package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;
		a--;
		
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio");
		System.out.println(++a == b--); // aqui, como o -- tem precedência inferior, ele primeiro compara o ++a com o b;
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
