package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ProgramNome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add(sc.nextLine());
		nomes.add(sc.nextLine());
		nomes.add(sc.nextLine());
		nomes.add(sc.nextLine());
		
		
		Collections.sort(nomes);
		nomes.forEach(nome -> System.out.println(nome));
		}

		
	}


