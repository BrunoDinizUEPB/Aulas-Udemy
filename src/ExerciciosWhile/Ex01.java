package ExerciciosWhile;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int senha;
		System.out.println("Digite a senha: ");
		senha = entrada.nextInt();
		
		while (senha != 2002) {
			
			System.out.println("Senha Invalida");
			System.out.println("Digite a senha: ");
			senha = entrada.nextInt();
			
		}
			System.out.println("Acesso Permitido");
	}

}