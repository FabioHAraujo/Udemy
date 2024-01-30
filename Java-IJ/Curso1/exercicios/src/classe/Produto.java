package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
        if (desconto >= 1) {
            preco = preco - (preco * desconto * 0.01);
            return preco;
        } else {
            preco = preco * (1 - desconto);
            return preco;
        }
    }

    double precoComDesconto(double descontoDoGerente) {
        if (descontoDoGerente >= 1) {
            preco = preco - (preco * descontoDoGerente * 0.01);
            return preco;
        } else {
            preco = preco * (1 - descontoDoGerente);
            return preco;
        }
    }
}
