package classe.desafios;

import java.util.Scanner;

public class ConstrutorTeste {
    public static void main(String[] args) {
        System.out.println("Você deseja criar data padrão ou personalizada?");
        System.out.println("Digite 1 para padrão, 2 para personalizada");
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        if(opcao==1){
            Construtor c1 = new Construtor();
            c1.imprimeData();
        }
        else if(opcao==2){
            int dia, mes, ano;
            System.out.print("Digite um dia: ");
            dia = entrada.nextInt();
            System.out.print("Digite um mês: ");
            mes = entrada.nextInt();
            System.out.print("Digite um ano: ");
            ano = entrada.nextInt();
            Construtor c1 = new Construtor(dia, mes, ano);
            c1.imprimeData();
        }
        else{
            System.out.println("Opção inválida. Execute novamente");
        }
    }
}
