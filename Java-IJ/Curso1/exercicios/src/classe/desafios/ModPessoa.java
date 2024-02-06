package classe.desafios;

public class ModPessoa {
    String nome;
    double peso;
    int idade;
    double altura;
    double imc;
    ModPessoa(){

    }
    ModPessoa(String nome, double peso, int idade, double altura){
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
        this.imc = peso/(altura*altura);
    }
    void setNome (String nome){
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    void calcImc(){
        this.imc = peso/(altura*altura);
    }

    void comer(ModComida c1){
        System.out.printf("Você comeu %s e seu peso que era de %.2f agora é de %.2f\n", c1.nome, this.peso, (this.peso += c1.peso));
        this.peso += c1.peso;
    }
}
