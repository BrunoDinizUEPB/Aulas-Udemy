package ExerciciosFor;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int n;
		System.out.println("Digite a quantidade de testes: ");
		n = entrada.nextInt();
		
		for (int i= 0 ; i < n ; i++) {				
			
			double a = entrada.nextDouble();
			double b = entrada.nextDouble();
			double c = entrada.nextDouble();
			
			double media = (a * 2 + b * 3 + c * 5) / 10;
			
			System.out.printf("%.1f%n",media);
		}
		
	}

}
