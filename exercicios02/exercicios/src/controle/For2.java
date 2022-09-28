package controle;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero: ");
		numero = sc.nextInt();
		for(; numero >=0 ;numero -= 2) {
			System.out.println(numero);
			sc.close();
		}
		System.out.println("O programa terminou!!!");
		
		
	}

}
