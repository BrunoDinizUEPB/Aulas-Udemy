package ExerciciosVetorArrayList;

import java.util.Locale;
import java.util.Scanner;

public class QuartoMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Quarto []  vetor = new Quarto [10]; 
		
		System.out.print("Quantos quartos serão alugados ?");
		int n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			
			System.out.println("Quarto #" + i + ":");
			System.out.print("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();
			System.out.print("E-mail: ");
			String email = entrada.nextLine();
			System.out.print("Quarto: ");
			int quarto = entrada.nextInt();
			vetor[quarto] = new Quarto (nome, email);		
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		
		for (int i = 0; i < 10; i++) {
			
			if (vetor[i] != null) {
				
				System.out.println(i +": "+ vetor[i]);
			}
		}
		
		
		
		
		
		entrada.close();

	}

}
