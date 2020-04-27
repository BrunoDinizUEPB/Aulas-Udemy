package ExerciciosFor;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n, x, d = 0, f = 0;
		x = entrada.nextInt();
		
		for(int i = 0; i < x; i++) {
			n = entrada.nextInt();
			
			if (n >= 10 && n <= 20) {
				
				d++;
			}
			else {
				
				f++;		
			}
		}
			System.out.println("in="+d);
			System.out.println("out="+f);
	}

}
