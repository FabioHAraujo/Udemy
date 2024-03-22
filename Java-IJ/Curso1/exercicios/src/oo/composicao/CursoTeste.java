package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);

        curso2.addAluno(aluno1);
        curso2.addAluno(aluno3);

        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);

        curso1.getAlunos();
        curso2.getAlunos();
        curso3.getAlunos();

        System.out.println();

        aluno1.getCursos();
        aluno2.getCursos();
        aluno3.getCursos();

        System.out.println();
        Curso cursoEncontrado = aluno1.procuraCurso("Web 2023");

        if (cursoEncontrado != null) {
            cursoEncontrado.getAlunos();
        }
    }
}
