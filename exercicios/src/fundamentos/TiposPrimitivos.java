package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Worker information
		
		//Integer numerics type
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Real numeric type
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Boolean type
		boolean estaDeFerias = true;//false
		
		//Char type
		char status = 'A';// \u0010
		
		//Enterprise days
		System.out.println(anosDeEmpresa * 365);
		
		//travels number
		System.out.println(numeroDeVoos / 2);
		
		//points for Dollar
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		
		System.out.println(id + "ganha ->" +salario);
		System.out.println("Ferias? "+ estaDeFerias);
		System.out.println("Status: "+ status);
	}

}
