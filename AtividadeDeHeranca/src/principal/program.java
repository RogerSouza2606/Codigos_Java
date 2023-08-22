package principal;

import java.util.Scanner;

import entities.Funcionario;

public class program {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do funcionário: ");
		funcionario.setNome(sc.nectLine());
	}

}
