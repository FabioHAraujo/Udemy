package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número");
		
		int numero = Integer.parseInt(valor);
		
		if(numero%2 == 0) {
			JOptionPane.showMessageDialog(null, "Número par");
		} else {
			JOptionPane.showMessageDialog(null, "Numero Ímpar");
		}
	}
}
