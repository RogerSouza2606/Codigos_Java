package principal;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		//entrar com um n�mero e dizer se � par ou impar
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Entre com o n�mero para saber se ele � par ou impar: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � par");
		}
		else {
			System.out.println(numero + " � impar");
		}
		
		leia.close();

	}

}
