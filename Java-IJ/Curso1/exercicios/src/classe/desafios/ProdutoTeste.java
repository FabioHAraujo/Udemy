package classe.desafios;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        System.out.println("Vamos cadastrar produtos e ver seu preço com desconto.");
        Scanner entrada = new Scanner(System.in);
        externo: while(true){
            System.out.println("Você Pretende cadastrar produtos Padrão ou data Especial?" +
                    "\nCaso não deseje mais cadsatrar produtos, digite SAIR");
            String opcao = entrada.nextLine();
            if(opcao.equalsIgnoreCase("padrão") || opcao.equalsIgnoreCase("padrao")){
                System.out.println("A partir de agora, digite os valores e nome de produto.");
                interno: while(true) {
                    System.out.print("Digite o nome do produto: ");
                    String nome = entrada.nextLine();
                    System.out.print("Agora digite o preço do produto: R$");
                    double preco = entrada.nextDouble();
                    Produto p1 = new Produto(nome, preco);
                    p1.imprimeProduto();
                    System.out.println();
                    System.out.print("Deseja cadastrar novo produto (responda com sim ou não)? ");
                    entrada.nextLine();
                    String escolha = entrada.nextLine();
                    if (escolha.equalsIgnoreCase("não") || escolha.equalsIgnoreCase("nao")) {
                        break interno;
                    }
                }
            } else if (opcao.equalsIgnoreCase("especial")) {
                System.out.print("Qual a data especial? ");
                Produto.especial = entrada.nextLine();
                System.out.print("Qual o Desconto Especial? ");
                Produto.defineDesconto(entrada.nextDouble());
                System.out.println("A partir de agora, digite os valores e nome de produto para a promoção de " + Produto.especial +
                        " com desconto de " + String.format("%.02f",Produto.desconto*100) + "% em toda a loja!!!");
                entrada.nextLine();
                interno: while(true) {
                    System.out.print("Digite o nome do produto: ");
                    String nome = entrada.nextLine();
                    System.out.print("Agora digite o preço do produto: R$");
                    double preco = entrada.nextDouble();
                    Produto p1 = new Produto(nome, preco);
                    p1.imprimeProduto();
                    System.out.println();
                    System.out.print("Deseja cadastrar novo produto (responda com sim ou não)? ");
                    entrada.nextLine();
                    String escolha = entrada.nextLine();
                    if (escolha.equalsIgnoreCase("não") || escolha.equalsIgnoreCase("nao")) {
                        break interno;
                    }
                }
            }
            else if (opcao.equalsIgnoreCase("sair")){
                break externo;
            }
        }
    }
}