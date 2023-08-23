package entities;

public class Funcionario {

	private String nome;
	private int idade;
	protected double salarioBruto;
	private double bonificacao = 0.05;
	
	
	public double getBonificacao() {
		return bonificacao;
	}


	public double getSalarioBruto() {
		return salarioBruto;
	}
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
	
	public void salarioBrutoMaisBonificacao(double bonificacao) {
	this.salarioBruto += 0.05;	
	}
	public void obterDados() {
		System.out.println("Nome do funcionário: " + nome);
		System.out.println("Idade do funcionário: " + idade);
		System.out.println("Salario do funcionário: " + salarioBruto);
	}
		
	}
	
	
	

