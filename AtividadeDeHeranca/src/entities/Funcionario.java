package entities;

public class funcionario {

	private String nome;
	private int idade;
	protected double salarioBruto;
	private double bonus;
	
	
	public double getBonus() {
		return bonus;
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
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public void obterFuncionario() {
		System.out.println("Nome do funcion�rio: " + nome);
		System.out.println("Nome do idade: " + idade);
		System.out.println("Nome do sal�rio Bruto: " + salarioBruto);
		System.out.println("B�nus: " + getBonus());
		System.out.println("Salario atualizado: " + (salarioBruto + getBonus()));
	}

		
	}
	
	
}
