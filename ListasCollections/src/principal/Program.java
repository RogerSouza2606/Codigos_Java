package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		//Listas trabalham com dados do mesmo tipo
		//Uma lista é um tipo genérioco de uma collection
		//Uma lista é uma coleção de dados 
		
		ArrayList<String> nomes = new ArrayList<>();
		
		String nome1 = "Adicionar por último";
		
		
		nomes.add("Roger");
		nomes.add("Renan");
		nomes.add("Rafael");
		nomes.add("Ronni");
		nomes.add(nome1);
		
		System.out.println(nomes);
		
		System.out.println(nomes.get(4));

		nomes.remove(1);
		
		System.out.println(nomes);
		
		
		System.out.println("\nImprimindo com forEach: ");
		for(String nome : nomes) {
			System.out.println(nomes);
		}
		
		System.out.println("\nImprimindo com for: ");
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("\nImprimindo com expressão lambia: ");
		//pesquisem sobre expressão lambia
		
		nomes.forEach(nome -> System.out.println(nome));
		
		System.out.println("\nImprimindo ordenadamente: ");
		Collections.sort(nomes);
		
		nomes.forEach(nome -> System.out.println(nome));
		
		
	}

}
