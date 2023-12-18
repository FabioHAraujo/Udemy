package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 10000000L;

		System.out.println(b.byteValue());
		System.out.println(s.shortValue());
		System.out.println(i);
		System.out.println(b.toString());
		System.out.println(i.intValue());
		System.out.println(l.longValue());
		
		Float f = 132.1F;
		System.out.println(f);
		
		Double d = 1324.5544;
		System.out.println(d);

		/*
		 * Integer in = Integer.parseInt(entrada.nextLine()); 
		 * System.out.println(in);
		 */

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
		
	}
}
