package oo.composicao;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void addCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    void getCursos () {
        int index = 1;
        System.out.println("O Aluno " + this.nome + " Está Matriculado Nos Cursos: ");
        for(Curso curso : cursos) {
            System.out.println(index + ": " + curso.nome);
            index++;
        }
    }

    Curso procuraCurso (String nome) {
        for(Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
            return null;
    }
}
