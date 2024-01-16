package controle.desafios;

/*
    PROGRAMA DESTINADO A:
    2. Criar um programa informa se o ano atual é um ano bissexto;
 */

import java.io.PrintStream;
import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
        System.out.println("Vamos descobrir se o ano é bissexto");
        System.out.println("Para fechar o programa, digite -1");

        Scanner entrada = new Scanner(System.in);

        int ano = 0;

        while (ano != -1) {
            System.out.printf("Digite um ano: ");
            ano = entrada.nextInt();
            String temp = String.valueOf(ano);
            if (temp.endsWith("00") && ano%400 == 0) {
                if(ano%4 == 0) {
                    System.out.println("O ano é bissexto");
                }
            }
            else if (ano%4 == 0 && !temp.endsWith("00")) {
                System.out.println("O ano é bissexto");
            }
            else {
                System.out.println("O ano não é bissexto");
            }
        }
    }
}
