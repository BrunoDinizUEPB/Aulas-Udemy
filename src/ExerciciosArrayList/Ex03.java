package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
Scanner entrada = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Bruno");
		lista.add("Cecília");
		lista.add("Francine");
		lista.add("Kiara");
		lista.add("Diniz");
		
		for (String x : lista) {
			
			System.out.println(x);
			
		}
		
		System.out.println("##################");
		System.out.println();
		
		System.out.println("Deseja remover um nome (S/N) ?");
		
		String resposta = entrada.nextLine();

		if(resposta.equals("S")) {
			
			System.out.println("Digite o número da possição do nome ");
				int n = entrada.nextInt();
				lista.remove(n);
				
			for (String x : lista) {
				
				System.out.println(x);
				
			}
		}
		else
			
				for (String x : lista) {
				
				System.out.println(x);
				
			}
		
		
		entrada.close();	
		}
}

