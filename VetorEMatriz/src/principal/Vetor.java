package principal;

public class Vetor {

	public static void main(String[] args) {
		//Vetor é uma sequencia não ordenada de dados tipo a contagem do Vetor é por indice e inicia
		//do indice 0
		//Vetor não pode conter dados de tipos diferentes
		//Vetor tbm é conhecido como Array
		//Vetor é unidimensional, uma direção
		//os dados do Array são armazenados em um espaço de memória
		
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
