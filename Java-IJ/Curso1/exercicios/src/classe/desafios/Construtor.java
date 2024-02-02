package classe.desafios;

public class Construtor {
    int dia;
    int mes;
    int ano;
    Construtor() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    Construtor(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    void imprimeData(){
        System.out.printf(
                "A data é: %02d/%02d/%04d" ,dia, mes, ano
        );
    }
}
