package principal;

import java.util.Scanner;

public class Atividade1408 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int[][] numeros = new int[3][3];
		
		int contador = 10;
		
		for(int i = 0; i < numeros.length; i++) 
			{
			for(int j = 0; j < numeros.length; j++)
				{
				numeros[i][j] = contador;
				System.out.print(numeros[i][j] + "\t");
				contador++;
			}
			System.out.println();
		}
		
		
		System.out.println("\n-----------------------------------------------------------");
		
		String[][] alunos = new String[4][5];
		
		for(int i = 0; i < alunos.length; i++) {
			for(int j = 0; j < alunos[i].length; j++) {
				if(j == 0) {
					System.out.print("Entre com o nome do aluno: ");
					alunos[i][j] = sc.nextLine();
				}
				else {
					System.out.printf("Entre com a nota %d nota: ", (j));
					alunos[i][j] = sc.nextLine();
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i < alunos.length; i++) {
			for(int j = 0; j < alunos[i].length; j++) {
				System.out.print(alunos[i][j] + "\t");
			}
		System.out.println();
		}

		
sc.close();
}
