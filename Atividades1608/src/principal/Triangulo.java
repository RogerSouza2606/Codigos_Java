package principal;

import java.util.Scanner;

import entities.CalculoTriangulo;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculoTriangulo triangulo = new CalculoTriangulo();
		
		System.out.println("Digite o primeiro valor: ");
		triangulo.valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		triangulo.valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		triangulo.valor3 = sc.nextInt();
		
		if(triangulo.valor1 + triangulo.valor2 > triangulo.valor3 && triangulo.valor1 + 
		triangulo.valor3 > triangulo.valor2 && triangulo.valor2 + triangulo.valor3 > 
		triangulo.valor1 ) {
			System.out.println("Os lados formam um triangulo!\n");
			if(triangulo.valor1 == triangulo.valor2 && triangulo.valor1 == triangulo.valor3) {
				System.out.println("Equilatero\n");
			}
			else if(triangulo.valor1 == triangulo.valor2 || triangulo.valor1 == triangulo.valor3 || triangulo.valor2 == triangulo.valor3) {
				System.out.println("Isoceles\n");
			}
			else {
				System.out.println("Escaleno");
			}
		}
		else {
			System.out.println("Não é um triangulo!");
		}
	}

}
