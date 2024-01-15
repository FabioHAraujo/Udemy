package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();

		if (media >= 7 && media <= 10) {
			System.out.println("A média do aluno é: " + media + " | APROVADO!");
		}

		else if (media >= 0 && media < 7) {
			System.out.println("A média do aluno é: " + media + " | REPROVADO!");
		}

		entrada.close();
	}
}
