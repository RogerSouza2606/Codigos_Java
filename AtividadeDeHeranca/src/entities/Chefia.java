package entities;

public class Chefia extends funcionario {

	@Override
	public double getBonus() {
	return (salarioBruto * 0.05);
	}
}
