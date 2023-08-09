package principal;

import java.util.Scanner;

public class MaiorNumeroEntreDoisNumeros {

	public static void main(String[] args) {
		//Maior número entre 2 números
		
		Scanner leia = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;

		System.out.println("Entre com o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		num2 = leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("Maior número é: " + num1);
		}
		else {
			System.out.println("Maior número é: " + num2);
		}
		
		System.out.println("Maior número é: " + Math.max(num1, num2));
		
		leia.close();
	}

}
