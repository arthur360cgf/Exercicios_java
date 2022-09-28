package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
	System.out.print("Bom");	
	System.out.print(" dia!\n\n");
	
	System.out.println("Bom");
	System.out.println("dia!!");
	
	System.out.printf("Megasena: %d %d %d %d",1 , 2 ,3 ,4);
	System.out.printf("Salario: %.1f%n", 123516.23135616);
	System.out.printf("Nome: %s%n", "João");
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o seu nome: ");
	String nome = entrada.nextLine();
	
	System.out.println("Digite o seu sobrenome: ");
	String sobrenome = entrada.nextLine();
	
	System.out.println("Digite sua idade: ");
	int idade = entrada.nextInt();
	
	System.out.println("\n\nNome = " + nome + " "+ sobrenome+ "\nidade: "+idade);
	
	System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
	
	
	entrada.close();
	
	}
}
