package classe.desafios;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {

        System.out.println("SEJA BEM-VINDO!!! VAMOS REGISTRAR SEU NOME E DATA DE NASCIMENTO, O MESMO PARA UMA SEGUNDA PESSOA!!!");

        Scanner entrada = new Scanner(System.in);
        Data d1 = new Data();

        System.out.print("Qual seu nome? ");
        d1.nome = entrada.nextLine();

        System.out.print("Que dia você nasceu? ");
        d1.dia = entrada.nextInt();

        System.out.print("De qual mês? (Digite em numeral) ");
        d1.mes = entrada.nextInt();

        System.out.print("Que ano nasceu? ");
        d1.ano = entrada.nextInt();

        String aniversario = d1.setData();
        System.out.println("Seu aniversário é: " + aniversario);
        System.out.println();
        entrada.nextLine();

        Data d2 = new Data();

        System.out.print("Qual seu nome? ");
        d2.nome = entrada.nextLine();

        System.out.print("Que dia você nasceu? ");
        d2.dia = entrada.nextInt();

        System.out.print("De qual mês? (Digite em numeral) ");
        d2.mes = entrada.nextInt();

        System.out.print("Que ano nasceu? ");
        d2.ano = entrada.nextInt();

        aniversario = d2.setData();
        System.out.println("Seu aniversário é: " + aniversario);
        System.out.println();

    }
}
