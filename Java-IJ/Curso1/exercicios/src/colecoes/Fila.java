package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    @SuppressWarnings("All")
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        /*
        Tanto offer quanto add adicionam elementos na fila.
        A diferença entre os 2 é o comportamento quando a fila está cheia
        Caso a fila esteja cheia no add, ele gera uma exception
        Caso a fila esteja cheia no offer, ele retorna false e não adiciona.
         */

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.add("Daniel");
        fila.offer("Rafaela");
        fila.add("Gui");

        /*
        Assim como no offer e add, aqui temos dua diferença de tratamento.
        Quando não há elementos na fila, o peek retorna null.
        Quando não há elementos na fila, o element gera exception.
         */
        System.out.println(fila.peek());
        System.out.println(fila.element());

        /*
        ÚTEIS:
        fila.size();
        fila.clear();
        fila.isEmpty();
        fila.contains();
         */

        // Imprime a cabeça da fila, como se fosse o head, mas tirando o elemento dela, como um pull (não entendi pq poll kkkkkk)
        // Tem também fila.remove(), que remove da fila, no caso do sout, vai imprimir também, mas caso a fila esteja vazia,
        // ele vai gerar exception, ao contrário do poll, que apenas resulta null.
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);

    }
}
