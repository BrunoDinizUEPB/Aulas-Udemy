package ExerciciosFor;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, fat = 1;
		n = entrada.nextInt();
		
		for(int i =1; i <= n; i++) {
			
			fat = fat * i;
		}
		
		System.out.println(fat);

	}

}
