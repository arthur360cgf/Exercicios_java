package fundamentos;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		//35\n
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = entrada.nextLine();
		
		
		
		entrada.close();
	}
}
