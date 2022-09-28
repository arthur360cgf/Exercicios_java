package exercicios_java;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//Wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//primitive
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println((""+num1).length());
		System.out.println((""+num2).length());
		
	}
}
