package principal;

public class Funcoes {

	public static void main(String[] args) {
		/*
		 * Fun��es elas representam um processamnto  ou processo;
		 * o que indentifica uma fun��o s�o os parenteses
		 * System.ou.println(); � um exemplo de fun��o/procedimento 
		 */
		mostrarMensagem();
		mostrarMensagemComParametro(16);
		System.out.println(calcular());
		int recebeCalcular = calcular();
		System.out.println("Recebeu: " + recebeCalcular);
		
		System.out.println("Resultado da soma: " + soma(10, 20));
		
		int x = 10;
		int y = 100;
		
		System.out.println("Uma nova soma: " + soma(x, y));
		
		int a = 50;
		int b = 50;
		
		System.out.println("nova soma: " + soma(a, b));

	}
	
	static void mostrarMensagem() {
		System.out.println("Minha primeira fun��o!");
	}
	static void mostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade �: " + idade);
	}
	static int calcular() {
		int x = 10;
		int y = 5;
		return x + y;
	}
	static int soma(int x, int y) {
		return x + y;
	}

}
