package ExerciciosIfElse;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int cod, qtd;
		double total = 0;
		
		System.out.println("Informe o código do produto: ");
		cod = entrada.nextInt();
		System.out.println("Informe a quantidade do produto: ");
		qtd = entrada.nextInt();
		
		if(cod == 1) {
			
			total = qtd * 4;
		}
		else if(cod == 2) {
			
			total = qtd * 4.5;
		}
		else if (cod == 3) {
			
			total = qtd * 5.00;
		}
		else if (cod == 4) {
			
			total = qtd * 2.00;
		}
		else if (cod == 5) {
			
			total = qtd * 1.50;
		}
		
		System.out.println("Valor Total R$ "+total);
	}

}
