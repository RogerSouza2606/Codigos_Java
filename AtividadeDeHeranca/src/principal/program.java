package principal;

import java.util.Scanner;

import entities.Funcionario;

public class program {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do funcionário: ");
		funcionario.setNome(sc.nextLine());
		
		System.out.println("Idade do funcionário: ");
		funcionario.setIdade(sc.nextInt());
		
		System.out.println("Salario Bruto: ");
		funcionario.setSalarioBruto(sc.nextDouble());
		
		System.out.println("Salário Bruto + bonificação: " + (funcionario.getSalarioBruto() + funcionario.setBonificacao()));
		
		
		
		sc.close();
	}

}
