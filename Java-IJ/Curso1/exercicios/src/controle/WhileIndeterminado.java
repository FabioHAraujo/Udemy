package controle;

import java.util.Scanner;

/*
 * ESTE FOI FEITO POR MIM, APESAR DE NÃO SER DESAFIO, OBVIAMENTE QUIS TENTAR.
 * 
 */

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean saida = true;
		
		while (saida) {
			System.out.println("Você diz:");
			String temp = entrada.next();
			saida = !(temp.equalsIgnoreCase("Saida") || temp.equalsIgnoreCase("saída"));
		}
		
		/*
		 * FEITO PELO PROFESSOR:
		 */
		/*
		String temp = "";
		while(!temp.equalsIgnoreCase("sair")) {
			System.out.println("Você diz:");
			temp = entrada.next();
		}*/
		
		entrada.close();
	}
}
