package controle;

public class SwitchSemBreak {
	
	//if(bool) ...
	//while(bool) ...
	//for(bool) ...
	public static void main(String[] args) {
		
		String faixa = "preta";
		//swith recebe um valor e não uma expressão de verdadeiro ou falso
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heidan Godan");
		case "verde":
			System.out.println("Sei o Heidan Yodan");
		case "laranja":
			System.out.println("Sei o Heidan Sandan");
		case "vermelha":
			System.out.println("Sei o Heindan Nidan");
		case "amarela":
			System.out.println("Sei o Heidan Shodan");
		//default:
//			System.out.println("Não sei nada");
			
		} 
		System.out.println("Fim!");
		
		int idade = 3;
		switch (idade) {
		case 3 :
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
		
	}

}
