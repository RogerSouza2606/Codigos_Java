package principal;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		//digitar um ano e dizer se � bissexto
		int ano = 0;
		
		System.out.print("Entre com o ano para saber se � bissexto: ");
		ano = leia.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
		System.out.println("� um ano bissexto!");
		}
		else if(ano % 400 == 0) {
			System.out.println("� um ano bissexto!");
		}
		
		else {
			System.out.println("N�o � um ano bissexto!");
		}
		
		leia.close();

	}

}
