package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int qtdAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdNotas = entrada.nextInt();

        double[][] notas = new double[qtdAlunos][qtdNotas];

        for (int i = 0; i < qtdAlunos; i++) {
            for (int j = 0; j < qtdNotas; j++) {
                System.out.printf("Digite a nota %d do aluno %d: ", j + 1, i + 1);
                notas[i][j] = entrada.nextDouble();
            }
        }
        double total=0;

        System.out.print("As nota dos alunos foram:");
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("\nAluno " + (i+1) + ": ");
            for (int j = 0; j < qtdNotas; j++) {
                System.out.print("[" + notas[i][j] + "] ");
                total+=notas[i][j]; // botei aqui intencionalmente, mas poderia ser no for anterior.
            }
        }

        double media = total/(qtdAlunos*qtdNotas);
        System.out.printf("\nA média final da turma é: %.2f", media);

        entrada.close();
    }
}
