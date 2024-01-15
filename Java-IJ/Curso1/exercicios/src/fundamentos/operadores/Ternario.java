package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4.6;
		String resultadoRecuperacao = media >= 5.0 ? "Em Recuperação" : "Reprovado";
		String resultado = media >= 7 ? "Aprovado" : resultadoRecuperacao;
		
		System.out.println("O Aluno está " + resultado);
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoFinal = temDesconto ? "Sim" : "Não";
		
		System.out.println("Tem desconto? " + resultadoFinal);	
	}
}
