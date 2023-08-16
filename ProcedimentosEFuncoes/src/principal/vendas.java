package principal;

import java.util.Scanner;

public class vendas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioBruto = 0;
		double totalVendas = 0;
		double inss = 0.05;
		double irpf = 0.11;
		
		System.out.println("Entre com o nome do funcionario: ");
		nome = sc.nextLine();
		
		System.out.println("Entre com o salário do fúncionario: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Entre com o total de vendas: ");
		totalVendas = sc.nextDouble();
		
		
		
		double descontos =calcularDescontos(salarioBruto, inss, irpf);
		double comissao = calcularComissao(totalVendas);
        double salarioLiquido = salarioBruto - descontos + comissao;
		
		
		System.out.println("*****************");
		System.out.println("Funcionario: " + nome);
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("Total de vendas no mês: " + totalVendas);
		System.out.println("Descontos do mês: " + descontos);
		System.out.println("Comissão do mês: " + comissao);
		System.out.println("Salário Liquido: " + salarioLiquido);
		
sc.close();
	}

	static double calcularDescontos(double salarioB, double inss, double irpf) {
		return((salarioB * inss) + (salarioB * irpf));
	}
	static double calcularComissao(double totalVendas) {
		double bonificacao = 0;
		
		if(totalVendas > 20000) {
			bonificacao = totalVendas * 0.05;
		}
		else if(totalVendas > 1500) {
			bonificacao = totalVendas * 0.03;
		}
		else if(totalVendas > 10000) {
			bonificacao = totalVendas * 0.01;
		}
		else { 
			bonificacao = 0;
			return bonificacao;
		}
		return bonificacao;
	
	}
	
	}
	
	
	

