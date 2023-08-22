package entities;

public class Funcionario {

	private String nome;
	private int idade;
	protected double salarioBruto;
	
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
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public void salarioBruto(double bonificacao) {
	this.salarioBruto += bonificacao;	
	}
	public void obterDados() {
		System.out.println("Nome do funcionário: " + nome);
		System.out.println("Idade do funcionário: " + idade);
		System.out.println("Salario do funcionário: " + salarioBruto);
	}
		
	}
	
	
	

