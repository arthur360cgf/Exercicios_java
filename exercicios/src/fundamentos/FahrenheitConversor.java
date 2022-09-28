package fundamentos;
import java.util.*;
public class FahrenheitConversor {
	public static void main(String[] args) {
		fahrenheit();
	}
	public static void fahrenheit() {
		float f;
		Scanner sc=  new Scanner(System.in);
		System.out.println("Text here fahrenheit temperature: ");
		f = sc.nextFloat();
		//temperature minus 32
		float minus = f - 32;
		//(temperature - 32) multiplied for 5
		float multiplier = minus * 5;
		//(F-32)* 5/9 (Fahrenheit to Celsius)
		float divisor =  multiplier / 9;
		System.out.println("Your temperature in Celsius is: "+ divisor);
		
		sc.close();
	}

}
