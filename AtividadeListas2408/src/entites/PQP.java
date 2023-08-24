package entites;

public class PQP {

	private String produto;
	private int quantidade;
	private double preco ;
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
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
	public PQP(String produto, int quantidade, double preco) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto: " + produto + " Quantidade: " + quantidade + " preco: " + preco;
	}
	
	
	
	
}
