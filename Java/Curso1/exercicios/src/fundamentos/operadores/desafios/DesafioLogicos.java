package fundamentos.operadores.desafios;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		boolean trabalho1 = false;
		// Trabalho na quinta (V ou F)
		boolean trabalho2 = false;
		
		boolean tv50 = false;
		boolean tv32 = false;
		boolean sorvete = false;
		boolean saudavel = true;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("O primeiro trabalho deu certo? (Sim ou Não)");
		String entrada1 = s.next();
		System.out.println("O primeiro trabalho deu certo? (Sim ou Não)");
		String entrada2 = s.next();
		
		if (entrada1.equalsIgnoreCase("Sim"))
			trabalho1 = true;
		if (entrada2.equalsIgnoreCase("Sim"))
			trabalho2 = true;
		
		if (trabalho1 && trabalho2) {
			tv50 = true;
			sorvete = true;
			saudavel = false;
		}
		else if (trabalho1 || trabalho2) {
			tv32 = true;
			sorvete = true;
			saudavel = false;
		}
		
		if (tv50) System.out.println("Seus 2 trabalhos deram certo, parabéns! Você saiu com a família, "
				+ "comprou uma TV de 50 polegadas e todos tomaram sorvete!!!");
		else if (tv32) System.out.println("Um dos seus trabalhos deu certo, parabéns! Você saiu com a família, "
				+ "comprou uma TV de 32 polegadas e todos tomaram sorvete!!!");
		else if (saudavel) System.out.println("Seus trabalhos infelizmente deram errado, você não vai poder sair "
				+ "comprar TV ou Sorvete para a família, mas isso será mais saudável!");
	}
}
