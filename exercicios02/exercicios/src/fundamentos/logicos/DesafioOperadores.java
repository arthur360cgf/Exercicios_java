package fundamentos.logicos;

public class DesafioOperadores {
	public static void main(String[] args) {
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		if (trabalhoTerca == false ^ trabalhoQuinta == false) {
			System.out.println("Niguem saiu para comer sorvete nem para comprar televisao");
			System.out.println("A saude da familia melhorou pois ninguem foi tomar sorvete");
		}
		if(trabalhoTerca == true || trabalhoQuinta == true) {
			System.out.println("Foi comprada uma TV de 32 polegadas e você e sua familia sairam para tomar sorvete");
			System.out.println("A saude da familia diminuiu por causa do açucar do sorvete");
		}
		if(trabalhoTerca == true && trabalhoQuinta == true) {
			System.out.println("Foi comprada uma TV de 52 polegadas e você e sua familia sairam para tomar sorvete");
			System.out.println("A saude da familia diminuiu por causa do açucar");
		}
	}
}
