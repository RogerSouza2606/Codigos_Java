package principal;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		//entrar com um número e dizer se é par ou impar
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Entre com o número para saber se ele é par ou impar: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " é par");
		}
		else {
			System.out.println(numero + " é impar");
		}
		
		leia.close();

	}

}
