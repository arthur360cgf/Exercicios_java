package controle;

import java.util.Scanner;

public class Revisao01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um numero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 ==0) {
			System.out.println("o numero "+numero+ " é par!");
		}
		else  {
			System.out.println("o numero "+numero+" é impar!");
			
		}
		
		sc.close();
	}
}
