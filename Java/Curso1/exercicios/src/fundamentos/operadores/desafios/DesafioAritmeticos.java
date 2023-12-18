package fundamentos.operadores.desafios;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double resultado;
		double f1 = 6 * (3+2);
		f1  = Math.pow(f1, 2);
		f1 = f1/(3*2);
		
		double f2 = (1-5) * (2-7);
		f2 = Math.pow((f2/2), 2);
		
		double divisor = Math.pow(10, 3);
		resultado = (Math.pow((f1-f2), 3))/divisor;
		
		System.out.println("O Resultado é: " + resultado);
		
		
		
		/* int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		*/
	}
}
