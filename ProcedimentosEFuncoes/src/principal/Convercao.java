package principal;

import java.util.Scanner;

public class Convercao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Informe o valor em d�lares: ");
		double dolares = sc.nextDouble();
		
		System.out.println("Informe o valor em reais: ");
		double reais = sc.nextDouble();
		
		System.out.printf("Valor em d�lar �: %.2f", converterParaDolar(reais));
		
		System.out.printf("\nValor em real �: %.2f", converterParaReal(dolares));
			
		
			
		
			
			
				
		
		
	sc.close();
	}


static double converterParaDolar(double reais) {
	return reais / 4.99;
}
static double converterParaReal(double dolar) {
	return dolar * 4.99;
}
		
	}

	

