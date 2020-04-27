package ExerciciosIfElse;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int  nr;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		nr = entrada.nextInt();
		if (nr >= 0) {
			System.out.println("Número não negativo ");
		}
		else {
			System.out.println("Número negativo ");
		}

	}

}
