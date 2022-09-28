package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double ray = 3.4;
		final double PI = 3.14159;
		double area = PI*ray*ray;
		
		System.out.println(area);
		
		ray = 10;
		area = PI*ray*ray;
		System.out.println("Area = "+area+"m²");
	}
}
