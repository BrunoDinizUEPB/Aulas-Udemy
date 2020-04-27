package Banco;

import java.util.Locale;
import java.util.Scanner;

public class CaixaDoBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		ContaBancaria conta;
		
		System.out.printf("Informe o número da conta ");
		int numero = entrada.nextInt();
		System.out.println();
		System.out.printf("Informe o nome do titular da conta ");
		entrada.nextLine();
		String nome = entrada.nextLine();
		System.out.println();
		System.out.print("Vai ter deposito inicial (s/n) ?");
		char resposta = entrada.next().charAt(0);
		
		if (resposta == 's') {
			
			System.out.printf("Informe o valor do deposito: ");
		
			double depositoInicial = entrada.nextDouble();
			conta = new ContaBancaria(numero, nome, depositoInicial);		
		}
		
		else {
			
			conta = new ContaBancaria(numero, nome);
		}
		
		System.out.println();
		System.out.printf("Dados da conta \n");
		System.out.println(conta);
		System.out.println();
		
		System.out.println("Informe o valor do deposito: ");
		double deposito = entrada.nextDouble();
		conta.deposito(deposito);
		System.out.println(conta);
		System.out.println();
		System.out.println("Informe o valor do saque: ");
		double saque = entrada.nextDouble();
		conta.saque(saque);
		System.out.println(conta);
		
		
		
		
		entrada.close();

	}

}