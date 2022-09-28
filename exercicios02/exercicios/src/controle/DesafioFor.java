package controle;

//Desafio não pode usar valor numerico para controlar o laço

public class DesafioFor {
	/**EXEMPLO
	public static void main(String[] args) {
		String valor = "#";
		for(int i = 1 ; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
	}*/
	
	public static void main(String[] args) {
		String valor = "#";
		for(; !valor.equals("######"); valor += "#") {
			System.out.println(valor);
		}
	}
}
