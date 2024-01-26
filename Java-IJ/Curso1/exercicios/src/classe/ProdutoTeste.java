package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;
        double p1Final = p1.preco * (1-p1.desconto);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;
        double p2Final = p2.preco * (1-p1.desconto);

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.desconto);
        System.out.printf("O Preço final de P1 É = R$%05.2f\n", p1Final);
        System.out.println();

        System.out.println(p2.nome);
        System.out.println(p2.preco);
        System.out.println(p2.desconto);
        System.out.printf("O Preço final de P2 É = R$%05.2f\n", p2Final);
        System.out.println();
    }
}
