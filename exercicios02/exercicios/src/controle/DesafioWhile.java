package controle;

import java.util.Scanner;

// medias das notas de uma turma
//colocar notas validas 
// variavel "total" que soma as variaveis
// variavel que vai dizer quantas notas validas foram digitadas
// quando o user digitar "-1" o programa ira sair
public class DesafioWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notas = 0;
		double media = 0;
		int nvalida = 0;
		
		while(notas != -1) {
			media = media +notas;
			System.out.println("Digite uma nota para o aluno: ");
			notas = sc.nextDouble();
			
			if(notas >= 0 && notas <= 10) {
				
				nvalida++;
			}
			
			
			
			else {
				System.out.println("digite uma nota valida");
				System.out.println("");
			}

			
		}
		media = media/nvalida;
		
		System.out.printf("A média total do aluno foi %.2f \n", media );
		System.out.println("");
		System.out.println("Você digitou "+nvalida+" notas validas");
		
	sc.close();
		
}
	
	/**public void resposta() {
		Scanner sc = new Scanner(System.in);
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota (ou -1 p/ sair)");
			nota = sc.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
				
			}else if(nota != -1) {
				System.out.println("Nota invalida!!!");
			}
		}
		double media = total / quantidadeDeNotas;
		System.out.println("Media = " + media);
		
		sc.close();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
