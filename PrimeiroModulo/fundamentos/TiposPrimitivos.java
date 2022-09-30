package PrimeiroModulo.fundamentos;
@SuppressWarnings("unused")
public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipos numericos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados= 3_134_845_223l;
	
		//Tipos numeros reias(ponto fluetuante)
		float salario = 11_445.44f;
		double vendasAcumuladas = 2_991_797_103.01;
	
		//Tipo booleano
		boolean estaDeFerias = false; //ou true
		
		//Tipo caractere
		char status = '\u0010';
	
		//Dias de empresa
		System.out.println(anosDeEmpresa *365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos /2);
	
		//Ponto por real
		System.out.println(pontosAcumulados / vendasAcumuladas);

		//
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias ? " + estaDeFerias);
		System.out.println("Status :" + status);
		
		
		
	
		
	}

}
