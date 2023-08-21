package principal;

import entites.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setTitular ("Roger");
		
		//System.out.println("Nome do titular: " + conta.getTitular());
		conta.setAgencia("2461-x");
		conta.setNumeroConta(6610);
		//conta.setSaldo(30.00);
		
		conta.depositar(300.00);
		
		conta.obterDadosbancarios();
		
		conta.sacar(500.00);
		
		conta.obterDadosbancarios();
		
		//conta.setSaldo = 500.00;
		
		conta.obterDadosbancarios();

	}

}
