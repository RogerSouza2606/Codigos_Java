package entities;

public class Bonificacao extends Funcionario {

	@Override
	public void salarioBrutoMaisBonificacao(double bonificacao) {
	salarioBruto += bonificacao + 0.05;
	
}
	
	
}
