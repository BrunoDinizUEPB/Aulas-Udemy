package ExemplosBasicos;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b; 
		
		System.out.printf("Informe um número = ");
		a = entrada.nextInt();
		System.out.printf("Informe um número = ");
		b = entrada.nextInt();
		
		if (a > b) {
			
			System.out.println("Ordem decrescente = "+ a +","+b);
		}
		else {
			
			System.out.println("Ordem decrescente = "+ b +","+a);
		}
		
		entrada.close();
	}

}
