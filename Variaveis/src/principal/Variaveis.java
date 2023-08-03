package principal;

public class Variaveis {

	public static void main(String[] args) {

		int numero = 10;
		// ou
		// numero = 10;
		double decimal = 10.50;

		int testeNumero = (int) 50.25;
		double testeNovoNumero = 10;

		// aspas duplas (")para "String"
		String nome = "Roger Souza";
		// aspas simples (') para "char"
		char sexo = 'M';
		// booleanos = valores verdadeiros ou falsos
		boolean verdadeiro = true;
		boolean falso = false;

		double peso = 81.1;
		int idade = 16;
		
		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(testeNumero);
		System.out.println(testeNovoNumero);
		System.out.println(nome);
		System.out.println(sexo);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.print("Nome");
		System.out.println( "Roger M");

		//para organizar os codigos usamos o
		//ctrl + shift + f
		System.out.println("*********************");
		System.out.println("Meu apelido é: " + nome);
		System.out.println("***********");
		System.out.println("Minha idade é: " + idade);
		System.out.println("*********************");
		System.out.println("Meu peso é: " + peso);
		
	}

}
