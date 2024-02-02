package classe.desafios;

public class Produto {
    static double desconto = 0.25;
    double preco;
    String nome;
    static String especial = "";

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    static void defineDesconto(double desconto){
        if (desconto>=1 && desconto<=100) {
            Produto.desconto = desconto / 100;
        }
        else if(desconto<1 && desconto>= 0) Produto.desconto = desconto;
        else System.out.println("Desconto Inválido");
    }

    void imprimeProduto(){
        if (especial.isEmpty()) System.out.println("O valor final do produto é: " + String.format("%.02f",(preco - (preco * desconto))));
        else System.out.println("Devido ao especial de " + especial + ", o Valor Final do Produto é: " + String.format("%.02f",(preco - (preco*desconto))));
    }
}
