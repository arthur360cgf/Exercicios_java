package controle;

import java.util.Scanner;

public class Se {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = sc.nextDouble();
		
		if(media <=10 && media >= 7.0) {
			System.out.print("Aluno foi Aprovado ");
			System.out.println("Parabens!!!");
		}
		if(media < 7 && media >= 4.5){
			System.out.println("Aluno de Recuperação");
		}
		
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		
		if(criterioReprovacao) {
			System.out.println("Aluno reprovado");
		}
		
		sc.close();
	}

}
