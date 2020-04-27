package ExerciciosIfElse;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Informe a hora inicial: ");
		horaInicial = entrada.nextInt();
		System.out.println("Informe a hora final: ");
		horaFinal = entrada.nextInt();
		
		if (horaInicial < horaFinal) {
			
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O jogo durou " + duracao + " Hora(s). " );
	}

}
