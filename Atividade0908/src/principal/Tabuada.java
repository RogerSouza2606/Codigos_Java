package principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char operacao;
		int numero = 0;
		
		System.out.println("Qual o tipo da opera��o (+, -, /, *)");
		operacao = sc.next().charAt(0);
		
		System.out.println("Qual o numero que deseja realizar a t�buada: ");
		numero = sc.nextInt();
		
		
		switch (operacao) {
		case '+':
				for(int contador = 1; contador <= 10; contador++) {
					System.out.println(numero + " + " + contador + " = " + (contador + numero));
				}
			break;
		case '-':
			int aux = numero;
			for(int contador = 1; contador <= 10; contador++) {
				System.out.println(
				(aux + contador) + " - " + numero + " = " + ((aux + contador) - numero)
				);
			}
		break;
		
		case '*':
			for(int contador = 1; contador <= 10; contador++) {
				System.out.println(numero + " * " + contador + " = " + (contador * numero));
			}
		break;
		
		case '/':
			for(int contador = 1; contador <= 10; contador++) {
				System.out.println(
				(numero * contador) + " / " + numero + " = " + (numero * contador / numero)
				);
			}
		break;

		default:
			System.out.println("Opera��o inv�lida");
			break;
		}
		
		
		
		
		
		
		
		
		
		
sc.close();
	}

}
