package controle.desafios;

import java.util.Scanner;

/*
    PROGRAMA DESTINADO A:
    1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
*/

public class Exec1 {
    public static void main(String[] args) {
        System.out.println("Vamos verificar se seu número é válido.");
        System.out.println("Digite um numero entre 0 a 10.");
        System.out.println("Para sair do programa, digite -666");

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        while (numero != -666) {
            System.out.println("Digite seu número: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0 && numero >= 0 && numero <= 10) {
                System.out.println("Seu número é válido e é par");
            } else if (numero != -666) {
                System.out.println("Seu número é inválido");
            }
            else {
                System.out.println("Você saiu do programa.");
            }
        }
        System.out.println("Adeus!");
    }
}
