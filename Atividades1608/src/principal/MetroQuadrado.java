package principal;
 
import java.util.Scanner;

import entities.Area;



public class MetroQuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Area area = new Area();
		
		
		
		
		System.out.println("Digite o comprimento: ");
		area.comprimento = sc.nextInt();
		System.out.println("Digite a largura: ");
		area.largura = sc.nextInt();
		
		System.out.println("O metro quadrado dessa área da: " + (area.comprimento * area.largura));

	}

}
