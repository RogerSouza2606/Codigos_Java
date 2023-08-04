package principal;

import java.util.Scanner;

public class AtividadeDeOperadoresAritimeticos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * Faça um Programa que peça dois números e imprima a soma;
		 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
		 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês (sem descontos e impostos).
		 *  Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		 *  C = 5 * ((F-32) / 9)
		 *  Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		 *  
		 * operador "+" para a soma
		 * operador "-" para a subtração
		 * operador "*" para a multiplicação 
		 * operador "/" para a divisão 
		 * operador "%" para o resto da divisão
		 */
		
		int numero1;
		int numero2;
			
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		
		int horasTrabalhadas;
		double ganhoPorHora;
		
		int fahrenheit;
		int celsios;
		
		System.out.println("Informe o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Informe o segundo número: ");
		numero2 = leia.nextInt();
		System.out.println("O primeiro número inserido foi: " + numero1);
		System.out.println("O  segundo número inserido foi; " + numero2);
		System.out.println("Resultado da soma: " +  (numero1 + numero2));
		System.out.println("-----------------------------");
		System.out.println("Quanto foi sua nota do primeiro bimestre: ");
		nota1 = leia.nextDouble();
		System.out.println("Quanto foi sua nota do segundo bimestre: ");
		nota2 = leia.nextDouble();
		System.out.println("Quanto foi sua nota do terceiro bimestre: ");
		nota3 = leia.nextDouble();
		System.out.println("Quanto foi sua nota do quarto bimestre: ");
		nota4 = leia.nextDouble();
		System.out.println("Nota do primeiro bimestre: " + nota1);
		System.out.println("Nota do segundo bimestre: " + nota2);
		System.out.println("Nota do terceiro bimestre: " + nota3);
		System.out.println("Nota do quarto bimestre: " + nota4);
		System.out.println("Soma das notas bimestral: " + (nota1 + nota2 + nota3 +nota4));
		System.out.println("A média é: " + ((nota1 + nota2 + nota3 +nota4) / 4));
		System.out.println("-----------------------------");
		System.out.println("Digite quantas horas trabalhadas: ");
		horasTrabalhadas = leia.nextInt();
		System.out.println("Digite quanto ganha por hora");
		ganhoPorHora = leia.nextDouble();
		System.out.println("Horas trabalhadas digitadas: " + horasTrabalhadas);
		System.out.println("Ganho por hora digitado: " + ganhoPorHora);
		System.out.println("Salário:" + (horasTrabalhadas * ganhoPorHora));
		System.out.println("------------------------------");
		System.out.println("Quanto é a temperatura em Fashrenheit: ");
		fahrenheit = leia.nextInt();
		System.out.println("A temperatura informada foi: " + fahrenheit);
		System.out.println("Essa temperatura convertida em graus celsius é:" + ((fahrenheit - 32) * 5 / 9));
		System.out.println("-------------------------------");
		System.out.println("Informe a temperatura em graus celsios: ");
		celsios = leia.nextInt();
		System.out.println("A temperatura informada em graus celsios foi: " + celsios);
		System.out.println("A temperatura em fahrenheit é:" + ((celsios * 9 / 5) + 32));
		
		
		leia.close();

	}

}
