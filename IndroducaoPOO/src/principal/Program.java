package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		//Conceito de carro
		//caracter�sticas (atributos)
		//comportamentos (metedos/fun��o)
		//exemplos de comportamentos acelerar, freiar, acender farois...
		//classe tem muitos recursos como:
		//sobrecarga de metodos e contrutores
		//4 pilares podem ser aplicados
		//entites(entidades do sistema) de acordo com a modelagem de negocios:
		//carro, pessoa, endere�o...
		//services: ClienteServeces, EmailServices...
		//Controllers
		//ultilitarias: Math
		//classe � um molde para o objeto
		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		Carro carroPopular = new Carro();
		
		carro.modelo = "celta";
		carro.ano = "2010";
		carro.placa = "xpt-2023";
		carro.cor = "azul";
		
		carroPopular.modelo = "gol";
		carroPopular.cor = "Vermelho";
		
		carroPopular.ano = sc.nextLine();
		
		
		/*System.out.println("O ano do carro �: "carro.ano);
		System.out.println("o ano do carro �: " + carroPopular.ano);*/
		
		System.out.println(carro.velocidade);
		carro.velocidadeVeiculo();
		carro.velocidadeVeiculo();
		carro.velocidadeVeiculo();
		carro.velocidadeVeiculo();
		
		System.out.println(carro.velocidade);
		carro.velocidade = 10;
		
		System.out.println(carro.velocidade);
		
		
		
		
	}

}
