package principal;

import java.util.Scanner;

public class Convercao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Informe o valor em d�lares: ");
		double dolares = sc.nextDouble();
		System.out.println("Informe o valor em reais: ");
		double reais = sc.nextDouble();
		
		System.out.println("Convertendo: " + reais + " reais para d�lares, fica: " + (reais / 5));
			System.out.println("Convertendo: " + dolares + " d�lares para reais fica: " + (dolares * 5));
		
			
		
			
			
				
		
		
	sc.close();
	}

	
}
