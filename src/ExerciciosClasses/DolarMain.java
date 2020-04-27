package ExerciciosClasses;

import java.util.Locale;
import java.util.Scanner;

public class DolarMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o valor do dolar: ");
		valorDolar = entrada.nextDouble();
		System.out.printf("Digite o valor da compra: ");
		valorCompra = entrada.nextDouble();
		pagar();
		System.out.printf("Valor à pagar em reais = $%.2f%n", pagar());
	
		entrada.close();

	}
	
	public static double valorDolar;
	public static double valorCompra;
	
	public static double pagar() {
		
		return valorDolar * valorCompra / 0.06;
	}
}
