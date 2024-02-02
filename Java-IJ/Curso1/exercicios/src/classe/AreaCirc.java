package classe;

public class AreaCirc {
    double raio;
    static final double pi = 3.141592;
    AreaCirc(double raio){
        this.raio = raio;
    }

    double area(){
        return pi * Math.pow(raio, 2);
    }
    static double diametro(double raio){
        return raio*2;
    }
}
