package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um dia da semana: ");
		String dia = sc.nextLine();
		
		/**char letra = dia.charAt(0);
		char letra2 = dia.charAt(2);
		
		if(letra == 'd' || letra == 'D') {
			System.out.println("1");
		}
		else if(letra == 's' || letra =='S'){
			System.out.println("2");
		}
		else if(letra == 't' || letra =='T'){
			System.out.println("3");
		}
		else if(letra == 'q' && letra2 == 'a' || letra == 'Q' && letra2 == 'a') {
			System.out.println("4");
		}
		else if(letra2 == 'i' ) {
			System.out.println("5");
		}
		else if(letra2 == 'x') {
			System.out.println("6");
		}
		else if(letra2 == 'b') {
			System.out.println("7");
		}*/
		
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}
		/**
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}*/
		
		if(dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}
		
		if(dia.equalsIgnoreCase("terça")) {
			System.out.println(3);
		}
		
		if(dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		}
		
		if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}
		
		if(dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}
	
		if(dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		}
		
		sc.close();
	}

}
