package principal;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * Uma estrutura de repeti��o
		 * repete determinado bloco de c�digos emnquanto
		 * uma condi��o for satisfeita
		 */
		
		//for = at�; ultilizado quando sabemos a quantidade de vezes que ser� necess�rio repetir
		//o bloco
		
		for(int contador = 0; contador < 10; contador++) {
		System.out.println("Contador est� valendo: " + contador);
		}
		
		/* While = enquanto
		 * geralmente ultilizado quando n�o sabemos a quantidade de vezes que ser� executado
		 * determinado comando
		 */
		
		int contador = 0;
		char opcao;
		
		System.out.println("Deseja entra no loop s/n");
		opcao = leia.next().charAt(0);
		
		while(contador < 10) {
			System.out.println("COntado  valendo: " + contador);
			contador++;
			
			System.out.println("Deseja continuar no loop s/n");
			opcao = leia.next().charAt(0);
		}
		
		/*do while = fa�a enquanto
		 * executa pelo menos 1 vez, temos a garantia de que ser� executado ao menos uma vez
		 */
		
		do {
			System.out.println("Contador valendo: " + contador);
			contador++;
			System.out.println("Deseja continuar o loop s/n");
			opcao = leia.next().charAt(0);
		}while(opcao == 's');
		
		
		
		
		
		leia.close();
	}

}
