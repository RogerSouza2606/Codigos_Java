package principal;

import java.util.ArrayList;
import java.util.Collections;

import entities.Pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa("Roger", 16);
		Pessoa pessoa2 = new Pessoa("Renan", 17);
		Pessoa pessoa3 = new Pessoa("Rafael", 17);
		
		
		ArrayList<Pessoa> pessoas= new ArrayList<>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		System.out.println(pessoas);
		
		Collections.sort(pessoas);
	
		
	}

}
