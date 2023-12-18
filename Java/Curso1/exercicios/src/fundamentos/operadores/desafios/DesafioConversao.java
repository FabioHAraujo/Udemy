package fundamentos.operadores.desafios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos calcular a média de salário entre 3 funcionários");
		
		System.out.println("Digite o salário do primeiro funcionário:");
		String salario1 = entrada.next().replaceAll(",", ".");
		System.out.println("Digite o salário do segundo funcionário:");
		String salario2 = entrada.next().replaceAll(",", ".");
		System.out.println("Digite o salário do terceiro funcionário:");
		String salario3 = entrada.next().replaceAll(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double media = (s1+s2+s3)/3;
		
		System.out.printf("A média salarial dos funcionários é: R$ %.2f", media, ".");
		
		entrada.close();
	}
}
