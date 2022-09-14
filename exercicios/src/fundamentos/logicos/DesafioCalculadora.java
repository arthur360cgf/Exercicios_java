package exercicios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextDouble();
		
		System.out.println("Digite a operação: ");
		String op = sc.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		sc.close();
	}
}
