package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.141592; // cria uma constante, por convenção, constantes sao em caps

		System.out.println(PI * raio * raio);

		double area = PI * raio * raio;
		System.out.println(area);

		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m²");
	}
}
