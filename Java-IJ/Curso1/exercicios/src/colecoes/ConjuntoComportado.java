package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        // Set<String> listaAprovados = new HashSet<>(); // Versões antigas exigiam que dentro do <> do
        // HashSet, também houvesse o String.

        Set<String> listaAprovados = new TreeSet<>(); // Dá pra usar SortedSet também com HashSet ou outro.
        // Ou mesmo um TreeSet com TreeSet

        listaAprovados.add("Pastelzinho de chocolate :) ");
        listaAprovados.clear();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        System.out.println(listaAprovados.size());
        
        for(String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(5);
        nums.add(12);
        nums.add(15);
        nums.add(8);

        for(int n: nums) {
            System.out.println(n);
        }
    }
}
