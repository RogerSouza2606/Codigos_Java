package principal;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * operador "+" para a soma
		 * operador "-" para a subtra��o
		 * operador "*" para a multiplica��o 
		 * operador "/" para a divis�o 
		 * operador "%" para o resto da divis�o
		 */
		
		int numero1 = 10;
		int numero2 = 10;
		int soma = numero1 + numero2;
		int divisao = numero1 / numero2;
		int subtrasao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int restoDaDivisao = numero1 % numero2;
		int cauculo = (10 + 10) * 10 / 10;
		
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Somando 2 n�meros: " + (numero1 + numero2));
		System.out.println("Divis�o de 2 n�meros: " + divisao);
		System.out.println("Subtra��o de 2 numeros: " + subtrasao);
		System.out.println("Multiplica��o de 2 n�meros: " + multiplicacao);
		System.out.println("Resto da divis�o: " + restoDaDivisao);
		System.out.println("Cauculo: " + cauculo);

	}

}
