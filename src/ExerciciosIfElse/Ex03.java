package ExerciciosIfElse;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite o primeiro número: ");
		A = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		B = entrada.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			
			System.out.println("São multiplos.");
		}
		else {
			System.out.println("Não são multiplos");
		}
			
	}

}
