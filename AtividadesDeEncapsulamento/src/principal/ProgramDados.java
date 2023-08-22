package principal;

import java.util.Scanner;

import entites.Dados;

public class ProgramDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dados dados = new Dados();
		
		System.out.println("Informe seu nome: ");
		dados.setNome(sc.nextLine());
		
		System.out.println("Informe seu email: ");
		dados.setEmail(sc.nextLine());
		
		System.out.println("Informe sua senha: ");
		
		dados.setSenha(sc.nextInt());
		
	}

}
