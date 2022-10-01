package controle;

import java.util.Scanner;

public class Revisao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1;
		double nota2;
		System.out.printf("Digite a primeira nota do aluno: \n");
		nota1 = sc.nextDouble();
		System.out.printf("Digite a segunda nota do aluno: \n");
		nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;

		if(media >= 7) {
			System.out.println("O aluno(a) foi aprovado(a)");
			
		}
		else if(media >= 4 && media <= 6.9) {
			System.out.println("O aluno(a) está de recuperação");
		}
		else if(media >= 0 && media <=3.9) {
			System.out.println("O aluno(a) foi reprovado(a)");
		}
		
		sc.close();
	}
}
