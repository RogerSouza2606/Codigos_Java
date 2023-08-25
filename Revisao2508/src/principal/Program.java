package principal;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Funcionario func = new Funcionario();
		
		pessoa.setNome("Roger");
		pessoa.setAltura(1.68);
		pessoa.setCpf("123.456.789-10");
		pessoa.setGenero("Masculino");
		pessoa.setIdade(16);

		System.out.println(pessoa);
		
		func.setNome("Roger");
		func.setAltura(1.68);
		func.setCpf("123.456.789-10");
		func.setGenero("Masculino");
		func.setIdade(16);
		func.setSalario(1500.00);
		func.setEmpresa("Sla");
		
		System.out.println(func);
		
		int[] numeros = new int[5];
		int cont = 10;
		for(int i = 0; i < 5; i++) {
			numeros[i] = cont++;
		}
		
		for(int n : numeros) {
			System.out.println(n);
		}
		
		
		
	}
	

}
