package classe.desafios;

import java.util.Scanner;

public class MinhaDataTeste {
    public static void main(String[] args) {

        System.out.println("SEJA BEM-VINDO!!! VAMOS REGISTRAR SEU NOME E DATA DE NASCIMENTO, O MESMO PARA UMA SEGUNDA PESSOA!!!");

        Scanner entrada = new Scanner(System.in);
        MinhaData d1 = new MinhaData();

        System.out.print("Qual seu nome? ");
        d1.nome = entrada.nextLine();

        System.out.print("Que dia você nasceu? ");
        d1.dia = entrada.nextInt();

        System.out.print("De qual mês? (Digite me numeral) ");
        d1.mes = entrada.nextInt();

        System.out.print("Que ano nasceu? ");
        d1.ano = entrada.nextInt();

        System.out.printf("O aniversário de %s é no dia %d do mês %02d do ano de %d", d1.nome, d1.dia, d1.mes, d1.ano);
        System.out.println();
        entrada.nextLine();

        MinhaData d2 = new MinhaData();

        System.out.print("Qual seu nome? ");
        d2.nome = entrada.nextLine();

        System.out.print("Que dia você nasceu? ");
        d2.dia = entrada.nextInt();

        System.out.print("De qual mês? (Digite me numeral) ");
        d2.mes = entrada.nextInt();

        System.out.print("Que ano nasceu? ");
        d2.ano = entrada.nextInt();

        System.out.printf("O aniversário de %s é no dia %d do mês %02d do ano de %d", d2.nome, d2.dia, d2.mes, d2.ano);
        System.out.println();

    }
}
