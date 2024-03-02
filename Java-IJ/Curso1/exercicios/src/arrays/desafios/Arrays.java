package arrays.desafios;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá, vamos calcular a média de notas.\nQuantas notas deseja inserir? ");

        int qtd = entrada.nextInt();

        System.out.print("Essas notas são de qual aluno? ");

        String aluno = entrada.next();

        double[] notas = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite a nota número %d do aluno %s: ", i+1, aluno);

            notas[i] = entrada.nextDouble();
        }

        double total = 0;

        for(double nota: notas) {
            total+= nota;
        }

        double media = total/notas.length;
        System.out.printf("A média final do aluno foi %.2f" ,media);
    }
}
