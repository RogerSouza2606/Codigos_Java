package principal;

import java.util.Scanner;

public class AtividadeEntradaDeDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		String nome;
		
		String sobrenome;
		
		char genero;
		
		System.out.println("\nDigite um primeiro n�mero: ");
		numero1 = leia.nextInt();
		
		System.out.println("\nDigite um segundo n�mero: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite seu sobrenome: ");
		sobrenome = leia.nextLine();
		
		System.out.println("Qual o seu gen�ro (M/F): ");
		genero = leia.next().charAt(0);
		
		System.out.println("\nO primeiro n�mero digitado foi: " + numero1);
		
		System.out.println("\nO segundo n�mero digitado foi: " + numero2);
		
		System.out.println("O nome digitado foi: " + nome);
		
		System.out.println("\nO sobrenome digitado foi: " + sobrenome);
		
		System.out.println("\nO genero digitado foi: " + genero);
		
		System.out.println("\nMeu nome completo: " + nome  + sobrenome);
		
		leia.close();

	}

}
