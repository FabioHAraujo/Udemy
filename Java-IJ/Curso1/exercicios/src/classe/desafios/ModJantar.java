package classe.desafios;

import java.util.Scanner;

public class ModJantar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Criando a comida
        System.out.println("Bem vindo ao jantar!");
        System.out.println("Por favor, me diga 2 pratos que quer comer");
        ModComida c1 = new ModComida();
        System.out.print("Qual a primeira comida? ");
        c1.setNome(entrada.nextLine());
        System.out.print("Qual peso em kg? ");
        c1.setPeso(entrada.nextDouble());
        System.out.print("Quantas unidades? ");
        c1.setQtd(entrada.nextInt());
        ModComida c2 = new ModComida();
        System.out.print("Qual a segunda comida? ");
        entrada.nextLine();
        c2.setNome(entrada.nextLine());
        System.out.print("Qual peso em kg? ");
        c2.setPeso(entrada.nextDouble());
        System.out.print("Quantas unidades? ");
        c2.setQtd(entrada.nextInt());

        // Criando Pessoa
        ModPessoa p1 = new ModPessoa();
        System.out.println("Perfeito!!! Agora me diga por favor o seu nome");
        entrada.nextLine();
        p1.setNome(entrada.nextLine());
        System.out.print("Qual sua altura em metros? ");
        p1.setAltura(entrada.nextDouble());
        System.out.print("Qual seu peso em kg? ");
        p1.setPeso(entrada.nextDouble());
        System.out.print("Quantos anos tem? ");
        p1.setIdade(entrada.nextInt());

        for (int i = 0; i < c1.qtd; i++) {
            p1.comer(c1);
        }
        for (int i = 0; i < c2.qtd; i++) {
            p1.comer(c2);
        }

    }
}
