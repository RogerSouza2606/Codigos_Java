package principal;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		System.out.println("Conta normal: ");
		conta.setTitular("Roger");
		conta.setAgencia(123456);
		conta.setNumeroConta(5522);
		conta.depositar(150.25);
		conta.sacar(50.00);
		
		conta.obterDadosBancarios();
		
		System.out.println("\nConta Corrente: ");
		cc.setTitular("Roger");
		cc.setAgencia(123456);
		cc.setNumeroConta(5522);
		cc.depositar(550.95);
		cc.sacar(250.00);
		
		cc.obterDadosBancarios();
		
		System.out.println("\nConta Corrente: ");
		cp.setTitular("Roger");
		cp.setAgencia(123456);
		cp.setNumeroConta(5522);
		cp.depositar(550.95);
		cp.sacar(250.00);
		
		cp.obterDadosBancarios();
	}

}
