package ExemplosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		double kmInicial;
		double kmFinal;
		double combustivel;
		double media;
		double kmTotal;
		
		System.out.print("Informe o KM inicial= ");
		kmInicial = entrada.nextDouble();
		System.out.print("Informe o KM final = ");
		kmFinal = entrada.nextDouble();
		System.out.print("Informe o combustivel gasto = ");
		combustivel = entrada.nextDouble();
		
		kmTotal = kmFinal - kmInicial;
		media = kmTotal / combustivel;
		
		
		System.out.printf("KM total percorrido = %.2f%n", kmTotal);
		
		System.out.printf("Media = %.2f%n", media );
		
		
		entrada.close();

	}

}
