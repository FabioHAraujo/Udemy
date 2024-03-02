package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        var notas = Arrays.toString(notasAlunoA);
        System.out.print(notas+"\n");
        notasAlunoA[0] = 10.0;
        notasAlunoA[1] = 5;
        notasAlunoA[2] = 7.65;
        notasAlunoA[3] = 7.2;

        // Redefinir para pegar os valores atuais
        notas = Arrays.toString(notasAlunoA);

        System.out.print(notas);


        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.print("\nA média final do aluno foi: " + total/notasAlunoA.length);
        total=0;
        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        for (int i = 0; i < notasAlunoB.length; i++) {
            total += notasAlunoB[i];
        }
        System.out.print("\nA média final do aluno foi: " + total/notasAlunoA.length);

    }
}
