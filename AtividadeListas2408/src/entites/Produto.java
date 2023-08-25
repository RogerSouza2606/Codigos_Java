package entites;

public class Produto implements Comparable<Produto>{

	private String nome;
	private int quantidade;
	public void setNome(String nome) {
		this.nome = nome;
	}
	private double preco;
	public String getNome() {
		return nome;
	
}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setNomeString(String String) {
		this.nome = String;
	}
	public Produto(String String, int quantidade) {
		super();
		this.nome = String;
		this.quantidade = quantidade;
	}
	public Produto(String nomeString, int quantidade, double preco) {
		super();
		this.nome = nomeString;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	return "Nome:" + nome + " Quantidade: " + quantidade + "Preço: " + preco;
	}
	
	@Override
	public  int compareTo(Produto outroProduto) {
		// TODO Auto-generated method stub
		return  this.nome.compareTo(outroProduto.nome);
	}
	
		
	}
	
		
	
	
	
	
	
	
	
	
	
