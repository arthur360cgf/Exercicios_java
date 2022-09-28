package fundamentos;

import java.util.Date;

//import javax.swing.JButton;

public class Interferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		Date h = new Date();
		System.out.println(h);
		
//		a = "..."; this var was created with double valor
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "text";
		c = "outro texto";
		System.out.println(c);
		
		double d;// var was declared
		d = 123.65;// var was initialized
		System.out.println(d);// print!
				
		var f = 12;
		System.out.println(f);
/*		f =12.01;		
		JButton botao = new JButton();
		System.out.println(botao);*/
	}

}
