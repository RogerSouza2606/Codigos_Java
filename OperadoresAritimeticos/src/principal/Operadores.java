package principal;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * operador "+" para a soma
		 * operador "-" para a subtração
		 * operador "*" para a multiplicação 
		 * operador "/" para a divisão 
		 * operador "%" para o resto da divisão
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
		System.out.println("Somando 2 números: " + (numero1 + numero2));
		System.out.println("Divisão de 2 números: " + divisao);
		System.out.println("Subtração de 2 numeros: " + subtrasao);
		System.out.println("Multiplicação de 2 números: " + multiplicacao);
		System.out.println("Resto da divisão: " + restoDaDivisao);
		System.out.println("Cauculo: " + cauculo);

	}

}
