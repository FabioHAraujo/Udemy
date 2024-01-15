package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioModulo {

	public static void main(String[] args) {
		// ler num1
		// ler num2
		// escolher + - * / %
		
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		double resultado;
		
		System.out.printf("Informe o primeio número: ");
		double num1 = entrada.nextDouble();
		System.out.printf("Informe o segundo número: ");
		double num2 = entrada.nextDouble();
		System.out.printf("Informe a operação");
		String operacao = entrada.next();
		System.out.printf(operacao.equals("+") ? "O resultado é: " + (resultado = num1 + num2): "");
		System.out.printf(operacao.equals("-") ? "O resultado é: " + (resultado = num1 - num2): "");
		System.out.printf(operacao.equals("*") ? "O resultado é: " + (resultado = num1 * num2): "");
		System.out.printf(operacao.equals("/") ? "O resultado é: " + (resultado = num1 / num2): "");
		System.out.printf(operacao.equals("%") ? "O resultado é: " + (resultado = num1 % num2): "");
		
		entrada.close();
	}
}
