package principal;

import java.util.Scanner;

public class MaiorNumeroEntreDoisNumeros {

	public static void main(String[] args) {
		//Maior n�mero entre 2 n�meros
		
		Scanner leia = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;

		System.out.println("Entre com o primeiro n�mero: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		num2 = leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("Maior n�mero �: " + num1);
		}
		else {
			System.out.println("Maior n�mero �: " + num2);
		}
		
		System.out.println("Maior n�mero �: " + Math.max(num1, num2));
		
		leia.close();
	}

}
