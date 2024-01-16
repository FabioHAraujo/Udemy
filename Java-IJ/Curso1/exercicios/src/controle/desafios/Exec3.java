package controle.desafios;

import java.util.Scanner;

/*
    PROGRAMADA DESTINADO A:
    3. Criar um programa que receba duas notas parciais, calcular a média final. Se a média do aluno
    for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do
    que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
 */
public class Exec3 {
    public static void main(String[] args) {
        System.out.println("Vamos calcular a média final do aluno.");

        Scanner entrada = new Scanner(System.in);

        double total = 0, nota1 = 0, nota2 = 0;

        System.out.printf("Digite a primeira note do aluno: ");
        nota1 = entrada.nextDouble();
        if (nota1 >=0 && nota1 <=10){
            System.out.printf("Digite a segunda note do aluno: ");
            nota2 = entrada.nextDouble();
            if (nota2 >=0 && nota2 <=10){
                total = (nota1 + nota2) / 2;
                if (total >= 7 && total <=10) {
                    System.out.println("Aluno Aprovado!");
                }
                else if (total >= 4 && total <7) {
                    System.out.println("Aluno em Recuperação");
                }
                else if (total > 0 && total < 4) {
                    System.out.println("Aluno Reprovado");
                }
            }
            else {
                System.out.println("Nota inválida");
            }
        }
        else {
            System.out.println("Nota Inválida");
        }
    }
}
