package principal;

import java.util.Scanner;

public class ExercicioDeRepeticao {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double nota = 0;
	
	System.out.println("Entre com uma nota entre 0 e 10: ");
	nota = sc.nextDouble();
	
	while(nota <= 0 || nota >= 10) {
		System.out.println("Nota invalida! ");
	}
	System.out.println("Nota valida! Valor informado: " + nota);
	
    System.out.println("------------------------------------------------------------------------------");
	
	for(int contador = 1; contador < 21; contador++) {
		System.out.println(contador);
	}
	for(int contador = 1; contador < 21; contador++) {
		System.out.print(" " + contador);
	}
	
	System.out.println("\n------------------------------------------------------------------------------");	
	
    for(int contador = 0; contador <= 50; contador++) {
    	if(contador % 2 != 0) {
    		System.out.println(contador);
    	}
    }
    
    System.out.println("\nou");
    
    System.out.println("\n ");
    
    for(int contador = 1; contador <= 50; contador += 2) {
    	System.out.println(contador);
    }
    
    /*contador = contador + 2
     * contador += 2
     * contador -= 2
     * contador *= 2
     * contador %= 2   
     */
    
    
    System.out.println("------------------------------------------------------------------------------");
	
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Entre com o primeiro número: ");
        num1 = sc.nextInt();
        
        System.out.println("Entre com o segundo número: ");
        num2 = sc.nextInt();
        
        for(int contador = ++num1; contador < num2; contador++) {
        	System.out.println(contador);
        }
        
    
    
sc.close();
		}

}
