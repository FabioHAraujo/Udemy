package classe.desafios;

public class Data {
    String nome;
    int dia;
    int mes;
    int ano;
    public Data() {
    }

    public Data(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String setData(){
        /*
        Minha solução!!!
        if(mes<10){
            return dia + "/0" + mes + "/" + ano;
        }
        else {
            return dia + "/" + mes + "/" + ano;
        }*/
        // DO PROFESSOR!!!
        if(mes<10){
            return String.format("%d/0%d/%d", dia, mes, ano);
        }
        else {
            return String.format("%d/%d/%d", dia, mes, ano);
        }
    }
}
