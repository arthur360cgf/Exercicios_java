package controle;

import java.util.Scanner;

public class Revisao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um ano: ");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano "+ano+" é bissexto");
		}
		else {
			System.out.println("O ano "+ano+" não é bissexto");
		}
		
		sc.close();
	}

}
