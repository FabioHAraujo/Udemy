package colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        // São todos convertidos para objetos.
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Pastel"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Character

        System.out.println("Tamanho do Conjunto:" + conjunto.size());
        conjunto.add("pastel"); // Adiciona pois há diferença de case
        System.out.println("Tamanho do Conjunto:" + conjunto.size());
        conjunto.add("Pastel"); // Não adiciona pois não há diferença de case
        System.out.println("Tamanho do Conjunto:" + conjunto.size());

        String resultado  = conjunto.remove("pastel") ? "verdadeiro" : "falso";
        System.out.println(resultado);
        // Retorna verdadeiro, pois existe "pastel para ser removido"
        resultado  = conjunto.remove("pastel") ? "verdadeiro" : "falso";
        System.out.println(resultado); // Retornará falso, pois mesmo que a string seja "igual",
        // devido ao case ele não irá remover "Pastel"

        System.out.println("Tamanho do Conjunto:" + conjunto.size());

        System.out.println(conjunto.contains('x') ? "Contém" : "Não contém");

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

//      conjunto.addAll(nums); União entre 2 conjuntos
//      System.out.println(conjunto);

        conjunto.retainAll(nums); // Somente a interseção, no caso o que está presente nos 2
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
