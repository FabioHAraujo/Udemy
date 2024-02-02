package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a;

        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(22,6,2002);
        Data d2 = d1;

        d1.imprimeData();

        d1.dia = 31;
        d1.imprimeData();
        d2.dia = 14;
        d1.imprimeData();
        d2.imprimeData();

        voltarDataPadrao(d1);

        d1.imprimeData();
        d2.imprimeData();

        int c = 5;
        alteraPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alteraPrimitivo(int a) {
        a++;
    }
}
