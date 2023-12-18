package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		// double a = 2.3;
		String s = "Bom dia X";
		System.out.println(s);

		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui");
		System.out.println(y);
		
		String z = "Bom dia X"
				.replace("X", "Paula")
				.toUpperCase()
				.concat("!!!");
		System.out.println(z);
		
	}
}
