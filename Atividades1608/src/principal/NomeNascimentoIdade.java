package principal;

import java.util.Scanner;

import entities.Idade;


public class NomeNascimentoIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Idade idade = new Idade();
		
		String nome;
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite o ano que você nasceu: ");
		idade.ano = sc.nextInt();
		System.out.println(nome + " tem " + (2023 - idade.ano));

	}

}
