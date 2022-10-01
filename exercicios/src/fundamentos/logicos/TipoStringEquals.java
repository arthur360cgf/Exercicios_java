package fundamentos.logicos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		//.trim() é uma função que ignora os espaços em brancos colocados no Scanner 
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}

}
