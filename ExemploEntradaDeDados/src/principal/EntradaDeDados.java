package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		//final double PI = 3.1415;
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.println("Por favor digite seu nome: ");
		//Leitura de dados tipo String (conjunto de caracteres)
		nome = leia.nextLine();
		//Comando para inserir o nome e dar valor ao mesmo
		
		System.out.println("\nDigiti a sua idade: ");
		idade = leia.nextInt();
		//
		System.out.println("\nDigite sua altura: ");
		altura = leia.nextDouble();
		
		System.out.println("\nQual o sexo (M/F)");
		sexo = leia.next().charAt(0);
		
		System.out.println("\nO nome digitado foi: " + nome);
		
		System.out.println("\nA idade digitada foi: " + idade);
		
		System.out.println("\nA altura digitada foi: " + altura);
		
		System.out.println("\nO sexo digitado foi: " + sexo);
		
		leia.close();
	}

}
