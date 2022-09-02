package fundamentos.logicos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		/**int a = 3 * 4 - 10;
		int b = (int)Math.pow(a, 3);
		double c = Math.pow(a, 2);
		System.out.println(c);
		System.out.println(b);**/
		
		int a = 6*(3+2);
		double b = Math.pow(a, 2);
		double c = b/6;
		
		double d = (1-5)*(2-7);
		double e = d/2;
		double f = Math.pow(e, 2);
		double g = c - f;
		
		double h = Math.pow(g, 3);
		double i = h/ Math.pow(10, 3);
		
		System.out.println(i);
		
	}
}
