package ExerciciosFor;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		n = entrada.nextInt();
		for (int i = 1; i <= n; i++ ) {
			
			int num1, num2;
			num1 = entrada.nextInt();
			num2 = entrada.nextInt();
			
			if (num2 == 0) {
				
				System.out.println("divisão impossivel");
			}
			else {
				
				int div = 0;
				div = num1 / num2;
				System.out.printf("%.1f%n",div);
			}
			
		}

	}

}
