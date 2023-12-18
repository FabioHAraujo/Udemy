package fundamentos;

public class tiposPrimitivos {

	public static void main(String[] args) {
		// Informações de Funcionário
		
		// Tipos Numéricos Inteiros
		byte anosDeEmpresa = 32;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3134845223L; // Para o java identificar que é Long, precis ter o L no final.
		// long pontosComUnderline = 3_134_845_223L; // É possível usar _ pra visualização dos numeros.
		
		
		// Ponto Flutuante
		float salario = 11445.44F; // Sem o F, ele não aceita pois identifica que ponto flutuante é double.
		// 		   Essas letras ↑ podem ser minusculas. Como l, f, afins.
		double vendasAcumuladas = 2991797103.01;
		
		// Boolean
		boolean estaDeFerias = false;
		
		// Char
		char status = 'A'; // Aceita somente uma letra
		// char icone = '\u0010'; // Aceita Unicode
		
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de Viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Salario
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}
