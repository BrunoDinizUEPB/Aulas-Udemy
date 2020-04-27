package ExerciciosFor;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x, i;
		System.out.println("Digite a entrada: ");
		x = entrada.nextInt();
		for (i = 1 ; i <= x; i++) {
			if (i % 2 != 0) {
				
				System.out.println(i);
			}
		}

	}

}
