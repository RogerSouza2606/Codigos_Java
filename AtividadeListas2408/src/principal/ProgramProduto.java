package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entites.Produto;

public class ProgramProduto {

	public static void main(String[] args) {
		Produto produto;
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		for(int i = 1; i < 4; i++) {
			
		produto = new Produto();
		
		
		
		;
		
		System.out.println("Entre com o nome do produto: ");
		produto.setNome(sc.nextLine());
		
		System.out.println("Entre com a quantidade do produto: ");
		produto.setQuantidade(sc.nextInt());
		
		System.out.println("Entre com o valor do produto: ");
		produto.setPreco(sc.nextDouble());
		sc.nextLine();
		produtos.add(produto);
		}
		System.out.println(produtos);
		
		Collections.sort(produtos);
		
		Produto p3 = new Produto("pirulito", 300, 0.56);
		Produto p1 = new Produto("Balinha", 100, 0.15);
		Produto p2 = new Produto("chiclete", 200, 0.65);
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		
		
		
		System.out.println("Imprima em ordem alfabética: ");
		System.out.println(produtos);
		
		System.out.println("Imprimar por quantidade: ");
		produtos.sort(Comparator.comparing(Produto::getQuantidade));
		System.out.println(produtos);
		
		System.out.println("Imprima por preço: ");
		produtos.sort(Comparator.comparing(Produto::getPreco));
		System.out.println(produtos);
		
	}
	
	
	
}
