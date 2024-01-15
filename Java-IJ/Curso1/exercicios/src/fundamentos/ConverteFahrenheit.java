package fundamentos;

public class ConverteFahrenheit {
	public static void main(String[] args) {
		double fahren = 95.34;
		double celcius = 0;
		final double diferenca = 32;
		final double fator = 5.0/9.0;	
		
		System.out.println(fator);
		System.out.println(fahren);
		
		celcius = (fahren - diferenca) * fator;
		
		System.out.println("A conversão de " + fahren + "° Fahrenheit em Celcius é igual a " + celcius + "° Celcius");
		
		fahren = 0;
		celcius = (fahren - diferenca) * fator;
		System.out.println("A conversão de " + fahren + "° Fahrenheit em Celcius é igual a " + celcius + "° Celcius");
	}
}
