package fundamentos;

import java.util.Scanner;
//Wrapper é a versão POO de cada tipo primitivo das variaveis
public class Wrapper {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; 
				//Integer.parseInt(entrada.next());
				// parseInt converte uma String em um valor inteiro
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1232.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c ='#';
		System.out.println(c + "...");
		
		entrada.close();
	}
}
