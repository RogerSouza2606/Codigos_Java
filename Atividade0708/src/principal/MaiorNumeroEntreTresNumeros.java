package principal;

import java.util.Scanner;

public class MaiorNumeroEntreTresNumeros {

	public static void main(String[] args) {
		//Maior número entre 3 números
		
		Scanner leia = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Entre com o pimeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num2 > num3) {
			System.out.println("Número " + num1 + " é o maior número");
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("Número " + num2 + " é o maior número");
		}
		else {
			System.out.println("Número " + num3 + " é o maior número");
		}
		
		
		leia.close();

	}

}
