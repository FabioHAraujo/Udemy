package classe.desafios;

public class ModComida {
    double peso;
    int qtd;
    String nome;

    ModComida(){

    }
    ModComida(String nome, double peso, int qtd){
        this.nome = nome;
        this.peso = peso;
        this.qtd = qtd;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    void setPeso(double peso){
        this.peso = peso;
    }
    void setQtd(int qtd){
        this.qtd = qtd;
    }
}
