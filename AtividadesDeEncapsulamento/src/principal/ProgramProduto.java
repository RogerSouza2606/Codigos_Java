package principal;

import java.util.Scanner;

import entites.Produto;

public class ProgramProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Entre com o nome do produto");	
	produto.setNome(sc.nextLine());
	
	System.out.println("Entre com o preço: ");
	produto.setPreco(sc.nextInt());
	
	System.out.println("Adicione a quantidade do produto: ");
		produto.adicionarQuantidade(sc.nextInt());
	
	System.out.println("Quantidade de Estoque: ");
	produto.mostrarEstoque();
	
	System.out.print("Remova a quantidade do estoque: ");
	produto.removerQuantidade(sc.nextInt());
	
	System.out.println("Quantidade de estoque: ");
	produto.mostrarEstoque();
	
	//produto.setNome();
	//produto.setPreco();
	//produto.adicionarQuantidade();
	
	produto.mostrarEstoque();
	
	
	
	
	
	
sc.close();
	}

}
