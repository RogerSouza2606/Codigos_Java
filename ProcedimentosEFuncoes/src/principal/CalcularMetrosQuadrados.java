package principal;

import java.util.Scanner;

public class CalcularMetrosQuadrados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENtre com o valor da largura: ");
		double largura = sc.nextDouble();
		
		System.out.println("Entre com o valor em comprimentos: ");
		double comprimento = sc.nextDouble();
		
		System.out.printf("O terreno tem: %.2f metros quadrados", multiplicacao(largura, comprimento));

		sc.close();
	}

	static double multiplicacao(double largura, double comprimento) {
		return largura * comprimento;
	}
	
}
