package principal;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * Uma estrutura de repetição
		 * repete determinado bloco de códigos emnquanto
		 * uma condição for satisfeita
		 */
		
		//for = até; ultilizado quando sabemos a quantidade de vezes que será necessário repetir
		//o bloco
		
		for(int contador = 0; contador < 10; contador++) {
		System.out.println("Contador está valendo: " + contador);
		}
		
		/* While = enquanto
		 * geralmente ultilizado quando não sabemos a quantidade de vezes que será executado
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
		
		/*do while = faça enquanto
		 * executa pelo menos 1 vez, temos a garantia de que será executado ao menos uma vez
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
