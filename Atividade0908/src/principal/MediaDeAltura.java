package principal;

import java.util.Scanner;

public class MediaDeAltura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double altura1 = 0;
		double altura2 = 0;
		double altura3 = 0;
		double altura4 = 0;
		double altura5 = 0;
		double altura6 = 0;
		double altura7 = 0;
		double altura8 = 0;
		double altura9 = 0;
		double altura10 = 0;
		
		System.out.println("Digite a altura da primeira pessoa: ");
		altura1 = sc.nextDouble();
		System.out.println("Digite a altura da segunda pessoa: ");
		altura2 = sc.nextDouble();
		System.out.println("Digite a altura da terceira pessoa: ");
		altura3 = sc.nextDouble();
		System.out.println("Digite a altura da quarta pessoa: ");
		altura4 = sc.nextDouble();
		System.out.println("Digite a altura da quinta pessoa: ");
		altura5 = sc.nextDouble();
		System.out.println("Digite a altura da sexta pessoa: ");
		altura6 = sc.nextDouble();
		System.out.println("Digite a altura da setima pessoa: ");
		altura7 = sc.nextDouble();
		System.out.println("Digite a altura da oitava pessoa: ");
		altura8 = sc.nextDouble();
		System.out.println("Digite a altura da nona pessoa: ");
		altura9 = sc.nextDouble();
		System.out.println("Digite a altura da decima pessoa: ");
		altura10 = sc.nextDouble();
		
		System.out.println("A média é: " + (altura1 + altura2 + altura3 + altura4 + altura5 + altura6 + altura7 + altura8 + altura9 + altura10) / 10);
		
		
		
		
		
    sc.close();
	}

}
