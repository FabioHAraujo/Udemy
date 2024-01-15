package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Vamos calcular a média da turma.\nPor favor, digite o nome da turma: ");
		String nomeTurma = entrada.nextLine();
		
		System.out.println("Certo, vamos começar a avaliação da turma " + nomeTurma + 
				". Ao final, digite -1 para finalizar");
		
		double nota = 0, total = 0;
		int qtdNotas = 0;
		
		while (nota != -1) {
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				qtdNotas++;
				total+= nota;
			} else if (nota != -1) {
				System.out.println("Nota Inválida!");
			}
		}
		
		double media = total/qtdNotas;
		
		System.out.println("A turma teve um total de " + total + " pontos.");
		System.out.println("Foram inseridas " + qtdNotas + " notas;");
		System.out.println("A média final da turma '" + nomeTurma + "' é: " + media + "!");
		
		entrada.close();

	}
}
