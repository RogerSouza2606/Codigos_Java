package principal;

import java.util.Scanner;

public class AtividadeDeOperadoresAritimeticos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * Fa�a um Programa que pe�a dois n�meros e imprima a soma;
		 * Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
		 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
		 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s (sem descontos e impostos).
		 *  Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		 *  C = 5 * ((F-32) / 9)
		 *  Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		 *  
		 * operador "+" para a soma
		 * operador "-" para a subtra��o
		 * operador "*" para a multiplica��o 
		 * operador "/" para a divis�o 
		 * operador "%" para o resto da divis�o
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
		
		System.out.println("Informe o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		numero2 = leia.nextInt();
		System.out.println("O primeiro n�mero inserido foi: " + numero1);
		System.out.println("O  segundo n�mero inserido foi; " + numero2);
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
		System.out.println("A m�dia �: " + ((nota1 + nota2 + nota3 +nota4) / 4));
		System.out.println("-----------------------------");
		System.out.println("Digite quantas horas trabalhadas: ");
		horasTrabalhadas = leia.nextInt();
		System.out.println("Digite quanto ganha por hora");
		ganhoPorHora = leia.nextDouble();
		System.out.println("Horas trabalhadas digitadas: " + horasTrabalhadas);
		System.out.println("Ganho por hora digitado: " + ganhoPorHora);
		System.out.println("Sal�rio:" + (horasTrabalhadas * ganhoPorHora));
		System.out.println("------------------------------");
		System.out.println("Quanto � a temperatura em Fashrenheit: ");
		fahrenheit = leia.nextInt();
		System.out.println("A temperatura informada foi: " + fahrenheit);
		System.out.println("Essa temperatura convertida em graus celsius �:" + ((fahrenheit - 32) * 5 / 9));
		System.out.println("-------------------------------");
		System.out.println("Informe a temperatura em graus celsios: ");
		celsios = leia.nextInt();
		System.out.println("A temperatura informada em graus celsios foi: " + celsios);
		System.out.println("A temperatura em fahrenheit �:" + ((celsios * 9 / 5) + 32));
		
		
		leia.close();

	}

}
