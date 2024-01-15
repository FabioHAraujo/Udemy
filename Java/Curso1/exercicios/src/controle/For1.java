package controle;

public class For1 {

	public static void main(String[] args) {
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("O Valor de contador é: " + contador);
		}
		
		int x = 2;
		for(;x<10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		// Laço Infinito
		/*for(;true;) {
			System.out.println("Nunca acaba");
		}*/
		
		// Laço Infinito
		for(;;) {
			System.out.println("Nunca acaba");
		}
	}
}
