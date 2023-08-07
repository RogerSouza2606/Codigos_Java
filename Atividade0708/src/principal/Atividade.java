package principal;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int ano;
		
		System.out.println("Digiti o ano: ");
		ano = leia.nextInt();
		System.out.println("O ano digitado foi: " + ano);
		
		System.out.println(ano / 4);
		
		
		
		switch (ano) {
		case 2:
			System.out.println(ano);
			break;
			
		case 4:
			System.out.println(ano);
			break;
		case 8:
			System.out.println(ano);
			break;
		case 10:
			System.out.println(ano);
			break;
		case 0:
			System.out.println(ano);
			break;

		default: 
			System.out.println("Esse ano, não é ano bissexto, pois não é divisivel por 4");
			break;
		}
		
		  
		
		
       leia.close();
	}

}
