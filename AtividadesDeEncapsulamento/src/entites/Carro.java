package entites;

public class Carro {
	
	private String modelo;
	private int ano;
	private String cor;
	private String motor;
	private String cambio;
	private double velocidade = 0;
    public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public void diminuirVelocidade() {
		if(velocidade <= 0 && velocidade >= 200) {
			velocidade -= 1;
		}
		}
	public void aumentarVelociadade() {
		if(velocidade <= 0 && velocidade >= 200) {
			velocidade += 1;
		}
	}
	public void mostrarStatus() {
		System.out.println(modelo);
		System.out.println(ano);
		System.out.println(cor);
		System.out.println(motor);
		System.out.println(cambio);
		System.out.println(velocidade);
	}
	
	
	
	}
		


