package principal;

public class Vetor {

	public static void main(String[] args) {
		//Vetor � uma sequencia n�o ordenada de dados tipo a contagem do Vetor � por indice e inicia
		//do indice 0
		//Vetor n�o pode conter dados de tipos diferentes
		//Vetor tbm � conhecido como Array
		//Vetor � unidimensional, uma dire��o
		//os dados do Array s�o armazenados em um espa�o de mem�ria
		
		/* (xpto123) = 10 , 20 , 30 , 40
		 */
		
		int array = 5;
		
		int[] numeros = new int[5];
		numeros[0] = 10;
		numeros[1] = 10;
		numeros[2] = 10;
		numeros[3] = 10;
		numeros[4] = 10;
		System.out.println("Fora do for: " + numeros[0]);
		
		for(int contador = 0; contador < numeros.length; contador++) {
			System.out.println("Dentro do for: " + numeros[contador]);
		}
		for(int numero : numeros) {
			System.out.println(numero);
		}

	}

}
