package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.12356;// Explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;// Explícita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;// Explícita (CAST)
		System.out.println(f);
	}
}
