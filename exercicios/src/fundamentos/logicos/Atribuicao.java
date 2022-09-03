package fundamentos.logicos;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;

//		c = c + b;
		c += b;

//		c = c - a;
		c -= a;
		
//		c = c * 2;
		c *= b;
		
//		c = c / 2;
		c /= a;
		
//		c = c % 2;
		c %= 2;
//		c++;
		
		System.out.println(c);
	}
}
