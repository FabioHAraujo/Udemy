package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita o dia da semana");
		
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Hoje é o dia 1 da semana");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Hoje é o dia 2 da semana");
		} else if (dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Terca")) {
			System.out.println("Hoje é o dia 3 da semana");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Hoje é o dia 4 da semana");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Hoje é o dia 5 da semana");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Hoje é o dia 6 da semana, SEXTOOOOOOOOOU!!!");
		} else if (dia.equalsIgnoreCase("Sábado") || dia.equalsIgnoreCase("Sabado")) {
			System.out.println("Hoje é o dia 7 da semana, SABADOOOOOOU!!!");
		} else {
			System.out.println("Dia Inválido");
		}
	}
}
