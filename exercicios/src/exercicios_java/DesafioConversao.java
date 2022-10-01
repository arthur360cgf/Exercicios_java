package exercicios_java;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro salario: ");
		String salario1 = sc.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do segundo salario: ");
		String salario2 = sc.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do terceiro salario: ");
		String salario3 = sc.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double soma = s1 + s2 + s3 ;
		
		System.out.println(soma);
		System.out.println("media = "+ soma / 3);
		
		sc.close();
	}
}
