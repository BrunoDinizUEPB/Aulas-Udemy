package ExerciciosClasses;

import java.util.Locale;
import java.util.Scanner;

public class Ex02Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Ex02 sc = new Ex02();
		
		System.out.printf("Nome = ");
		sc.nome = entrada.nextLine();
		System.out.printf("\nSalario Bruto = ");
		sc.salarioBruto = entrada.nextDouble();
		System.out.printf("\nImposto = ");
		sc.imposto = entrada.nextDouble();
		sc.salario();
		System.out.println("Nome = "+sc.nome+"\nSalario Liquido ="+sc.salario());
		System.out.println();
		System.out.printf("Informe a taxa de aumento = ");
		double taxa = entrada.nextDouble();
		sc.salarioNovo(taxa);	
		System.out.println();
		
		System.out.println("Dados do funcionario " + sc);
		
		entrada.close();
	}

}
