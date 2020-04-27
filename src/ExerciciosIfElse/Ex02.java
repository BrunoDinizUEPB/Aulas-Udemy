package ExerciciosIfElse;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int nr;
		System.out.println("Digite um número: ");
		nr = entrada.nextInt();
		
		if (nr % 2 == 0) {
			
			System.out.println("PAR");
		}
		else {
			
			System.out.println("IMPAR");
		}
	}

}
