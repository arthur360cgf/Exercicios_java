package controle;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		String palavra = "sair";
		Scanner sc = new Scanner(System.in);
		
		int contador = 1; 
		while(contador == 1) {
			System.out.println("Digite alguma palavra ou Coloque \"sair\" para sair");
			palavra = sc.next();
			if(palavra.equalsIgnoreCase("sair")) {
				break;
			}
			
		}
		System.out.println("Obrigado por usar");
		sc.close();
	}
}
