package principal;

import java.util.Scanner;

public class NomeNoaMediaAprovadoReprovado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double [4];
		
	    System.out.println("Entre com o nome do aluno: ");
	    String nome = sc.nextLine();
	    
	    for(int contador = 0; contador < notas.length; contador++) {
	    	System.out.println("Entre com a nota: ");
	    	notas[contador] = sc.nextDouble();
	    }
	    double media = (notas[0] + notas[1] + notas[2] + notas[4]) / 4;
	    
	    System.out.printf("A m�dia do %s �: %.2f", nome, media);
    
		
		
		
sc.close();
	}

}
