package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String valor = "";
			
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = sc.nextLine();
		}
		System.out.println("Obrigado por usar");
		sc.close();
	}
	
}
