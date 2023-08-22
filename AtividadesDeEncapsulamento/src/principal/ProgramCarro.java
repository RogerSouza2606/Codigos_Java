package principal;

import java.util.Scanner;

import entites.Carro;

public class ProgramCarro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("Informe o modelo do carro: ");
		carro.setModelo(sc.nextLine());
		
		System.out.println("Informe o ano do carro: ");
		carro.setAno(sc.nextInt());
		
		System.out.println("Informe a cor: ");
		carro.setCor(sc.nextLine());
		sc.nextLine();
		
		System.out.println("Informe o motor: ");
		carro.setMotor(sc.nextLine());
		
		System.out.println("Informe o câmbio: ");
		carro.setCambio(sc.nextLine());
		
		
				
		carro.mostrarStatus();
		
		carro.aumentarVelociadade();
		carro.aumentarVelociadade();
		carro.aumentarVelociadade();
		carro.aumentarVelociadade();
		carro.aumentarVelociadade();
		carro.aumentarVelociadade();
		
		carro.mostrarStatus();
		
		
		
		
	}

}
