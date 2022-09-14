package exercicios;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		System.out.println("O aluno está "+ resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "não";
		System.out.println("Tem desconto? "+ resultado);
	}
}
