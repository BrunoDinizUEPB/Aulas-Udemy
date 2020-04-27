package ExerciciosClasses;

import java.util.Locale;
import java.util.Scanner;

public class Ex01Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		Ex01 ret = new Ex01();
		
		System.out.println("Digite a Altura e Largura ");
		ret.altura = entrada.nextDouble();
		ret.largura = entrada.nextDouble();
		
		System.out.printf("Area = %.2f%n", ret.area());
		System.out.printf("Perimetro = %.2f%n", ret.perimetro());
		System.out.printf("Diagonal = %.2f%n", ret.diagonal());
		
		entrada.close();
	}

}
