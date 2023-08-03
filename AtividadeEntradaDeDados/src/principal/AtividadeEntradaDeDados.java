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
		
		System.out.println("\nDigite um primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("\nDigite um segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite seu sobrenome: ");
		sobrenome = leia.nextLine();
		
		System.out.println("Qual o seu genêro (M/F): ");
		genero = leia.next().charAt(0);
		
		System.out.println("\nO primeiro número digitado foi: " + numero1);
		
		System.out.println("\nO segundo número digitado foi: " + numero2);
		
		System.out.println("O nome digitado foi: " + nome);
		
		System.out.println("\nO sobrenome digitado foi: " + sobrenome);
		
		System.out.println("\nO genero digitado foi: " + genero);
		
		System.out.println("\nMeu nome completo: " + nome  + sobrenome);
		
		leia.close();

	}

}
