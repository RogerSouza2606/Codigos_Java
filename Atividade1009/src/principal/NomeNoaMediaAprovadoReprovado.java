package principal;

import java.util.Scanner;

public class NomeNoaMediaAprovadoReprovado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		double notaBimestral = 0;
		double media = 0;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		for(int contador = 1; contador < 5; contador++) {
			System.out.println("Digite a nota: ");
			notaBimestral = sc.nextDouble();
			media = media + notaBimestral;
		}
		
		System.out.println("A m�dia das notas �: " + (media / 4));
		
		if(media >= 7) {
			System.out.println(nome + " foi aprovado! Com a m�dia: " + media / 4);
		}
		else {
			System.out.println(nome + " foi reprovado! com a m�dia: " + media / 4);
		}
		
    
		
		
		
sc.close();
	}

}
