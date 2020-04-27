package ExerciciosClasses;

import java.util.Locale;
import java.util.Scanner;

public class Ex03Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		Ex03 sc = new Ex03();
		System.out.printf("Informe o Nome: ");
		sc.nome = entrada.nextLine();
		System.out.printf("Informe Nota 1 : ");
		sc.nota1 = entrada.nextDouble();
		System.out.printf("Informe Nota 2 : ");
		sc.nota2 = entrada.nextDouble();
		System.out.printf("Informe Nota 3: ");
		sc.nota3 = entrada.nextDouble();
		System.out.println();
		sc.notaFinal();
		System.out.printf("Nota final = %.2f%n",sc.notaFinal());
		
		if(sc.notaFinal() < 60) {
			
			System.out.println("Final");
			System.out.printf("Falta = %.2f%n ", sc.resta());
		}
		else {
			
			System.out.println("Aprovado");
		}
		
		
		
		entrada.close();

	}

}
