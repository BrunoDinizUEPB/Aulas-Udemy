package ExerciciosVetorArrayList;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		double vetor[] = new double [3];
		double num;
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print("Digite um n�mero inteiros: ");
			num = entrada.nextDouble();
			vetor[i] = num;	
		}
		
		for (int i = 3 ; i <= vetor.length ; i--) {
			
		System.out.println("Posi��o = " + i + " N�mero = "+ vetor[i]);
		
		}
		
		
		entrada.close();

	}


	

}
