package controle.desafios;

/*
    PROGRAMA DESTINADO A:
    4. Criar um programa que receba um número e diga se ele é um número primo.
 */

import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {
        System.out.println("Vamos descobrir se seu número é primp");
        System.out.println("Para sair do programa, digite -666");

        Scanner entrada = new Scanner(System.in);

        boolean primo = false;

        int teste = 12;

        repetidor: while(true) { // testando
            System.out.print("Digite um número, vamos descobrir se ele é priminho: ");
            int priminho = entrada.nextInt();
            if (priminho == -666) break repetidor;
            for (int i = 2; i <= priminho; i++) {
                if (priminho%i == 0 && i!=priminho) {
                    primo = false;
                    break;
                }
                else primo = true;
            }
            if(primo)
                System.out.println("O número é um priminho");
            else
                System.out.println("O número não é primo");
        }

        System.out.println("Vcê encerrou o programa, até a próxima!");

    }
}
