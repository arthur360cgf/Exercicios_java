package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o numer o: ");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		}
		
		if(numero % 2 == 1) {
			System.out.println("Número ímpar!");
		}
		/*
		if(numero % 2 == 0) {
			System.out.println("numero par");
		}
		else {
			System.out.println("numero ímpar");
		}*/
	}
	
}
