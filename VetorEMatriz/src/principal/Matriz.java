package principal;

public class Matriz {

	public static void main(String[] args) {
		//uma matriz é um vetor multidimencional ]
		//geralmente trabalhamos com 2 dimensões
		//linha e coluna, parece uma tabela
		
		
		//os dois ultimos abre e feha colchetes são
		//para indicar a coluna e a linha
		//no exemplo abaxo temos uma matriz 3 x 3
		int[][] numeros = new int[3][3];
		
		int contador = 10;
		
		for(int i = 0; i < numeros.length; i++)//colunas 
			{
			for(int j = 0; j < numeros.length; j++)//linhas
				{
				numeros[i][j] = contador;
				System.out.print(numeros[i][j] + "\t");
				contador++;
			}
			System.out.println();
		}
		
		

	}

}
