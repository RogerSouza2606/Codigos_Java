package principal;

import java.util.Locale;
import java.util.Scanner;

public class MathELocale {

	public static void main(String[] args) {
		//Atalho para importar ctrl + Shift + o
		final Locale pnto = new Locale("en", "us");
		Scanner leia = new Scanner(System.in);
		
		double altura = 0;
		double divisao = 10 / 3;
		double decimal = 10.3333333;
		
		//potencia
		System.out.println(Math.pow(2, 5));
		//maior numero entre 2 ou mais variaveis
		System.out.println(Math.max(2, 10));
		//menor numero entre 2 ou mais variaveis 
		System.out.println(Math.min(2, 5));
		 //obter raiz quadrada 
		System.out.println(Math.sqrt(16));
		//arredondar numeros
		System.out.println(Math.round(decimal));
		//numero PI armazenado
		System.out.println(Math.PI);
		
		
		/*System.out.printf("Resultado: %.2f", decimal);
		
		System.out.println("\nResultado:" + divisao);
		
		System.out.println("Entre com sua altura: ");
		altura = leia.useLocale(pnto).nextDouble();
		
		System.out.println("A altura digitada foi: " + altura); */
		
		leia.close();

	}

}
