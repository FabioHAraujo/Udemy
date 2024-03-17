package colecoes;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Claudio");
        usuarios.put(3, "Rogerio");
        usuarios.put(4, "Godofredo");
        usuarios.put(5, "Carlinhos");
        usuarios.put(40, "Juliana");

        System.out.println(usuarios);

        usuarios.put(1, "Marcelo"); // Mudando Valor a partir da chave.

        System.out.println(usuarios);

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty() ? "Map vazio" : "Map tem elementos");

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(40));
        System.out.println(usuarios.containsValue("Juliana"));

        System.out.println(usuarios.containsKey(40) ? "Contém" : "Não contém");
        System.out.println(usuarios.containsValue("Juliana") ? "Contém" : "Não contém");

        System.out.println(usuarios.get(5)); // Só funciona com a chave
        System.out.println(usuarios);
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Carlinhos") ? "Conjunto Chave:Valor identificado e removido" : "Conjunto Chave:Valor não identificado");
        System.out.println(usuarios);


        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey() + " = " + registro.getValue());
//            System.out.println(registro.getValue());
        }
    }
}
