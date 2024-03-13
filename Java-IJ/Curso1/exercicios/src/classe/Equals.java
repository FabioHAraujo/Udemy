package classe;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Usuario u1 = new Usuario();
        u1.nome = "Joao da Silva";
        u1.email = "Carlinha Peixoto";

        Usuario u2 = new Usuario();
        u2.nome = "Joao da Silva";
        u2.email = "Carlinha Peixoto";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


    }
}
