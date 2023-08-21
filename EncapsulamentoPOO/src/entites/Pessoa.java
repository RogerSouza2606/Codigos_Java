package entites;

public class Pessoa {
	
	private String nome;
	private int idade;
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	private int ano;
	
	public void calcularIdade(int anoNascimento) {
		idade = 2023 - anoNascimento;
	}
	
	public void imprimirDados() {
		
		System.out.printf("%c tem %d anos" , nome, idade);
	}
	

}
