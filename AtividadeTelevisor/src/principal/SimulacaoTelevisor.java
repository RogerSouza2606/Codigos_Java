package principal;

import java.util.Scanner;

import entities.Televisor;

public class SimulacaoTelevisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Televisor tv = new Televisor();
		
		tv.mostrarStatus();
		tv.ligarTelevisor();
		
		tv.mostrarStatus();
		
		tv.aumentarVolume();
		
		tv.mostrarStatus();
		
		tv.aumentaCanal();
		
		tv.mostrarStatus();
		
		tv.diminuirVolume();
		
		tv.diminuirCanal();
		
		tv.mostrarStatus();
		
		tv.deligarTelevisor();
		
		tv.mostrarStatus();
		
		
		
sc.close();
	}

}
