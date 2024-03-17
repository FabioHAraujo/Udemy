package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("Hobbit");

        // Mesma coisa que na fila.
        System.out.println(livros.peek());
        System.out.println(livros.element());

        // Na aula não estava assim, mas prefiro deixa num for
        // Adendo: Ele mostrou for each depois :v
        for(String livro : livros) {
            System.out.println(livros.poll());
        }
        System.out.println(livros.poll()); // Null, como sempre
        // System.out.println(livros.remove()); Exceção como sempre

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("Hobbit");
        System.out.println(livros.isEmpty() ? "Pilha vazia" : "Pilha não está vazia");

        // Usando pop, no luar do poll, prefiro ele mesmo.
        for(String livro : livros) {
            System.out.println(livros.pop());
        }
        System.out.println(livros.isEmpty() ? "Pilha vazia" : "Pilha não está vazia");

    }
}
