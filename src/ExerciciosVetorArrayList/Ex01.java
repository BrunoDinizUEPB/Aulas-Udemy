package ExerciciosVetorArrayList;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int vetor[] = new int [5];
		int num;
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print("Digite um n�mero inteiros: ");
			num = entrada.nextInt();
			vetor[i] = num;	
		}
		
		System.out.println();
		
		for (int i = 0; i < vetor.length; i++) {
			
		System.out.println("Posi��o = " + i + "N�mero = "+ vetor[i]);
		
		}
		
		
		entrada.close();

	}

}
