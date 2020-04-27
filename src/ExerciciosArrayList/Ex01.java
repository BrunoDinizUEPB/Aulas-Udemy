package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		
		//Cria uma lista do tipo String.
		List<String> listaNomes = new ArrayList<>();
		//Cria uma lista do tipo Double
		List<Double> listaNumeros = new ArrayList<>();
		//Cria ums lista de inteiros.
		List<Integer> listaInt = new ArrayList<>();
		
		// Adiciona nomes a lista.
		listaNomes.add("Maria");
		listaNomes.add("Cecília");
		listaNomes.add("Francine");
		listaNomes.add("Bruno");
		listaNomes.add("Diniz");
		listaNomes.add("Rosilda");
		listaNomes.add("Kiara");
		listaNomes.add("Gabriel");
		listaNomes.add("Felipe");
		listaNomes.add("Diniz");
		//imprime o tamanho da lista.
		System.out.println("Tamanho da Lista = "+listaNomes.size());
		
		
		//Imprime a lista de nomes.
		for (String nome : listaNomes) {
			System.out.println(nome);
			
		}
		
		
		
		System.out.println("------------------------");
		
		//Adiciona numeros a lista
		listaNumeros.add(10.5);
		listaNumeros.add(20.5);
		listaNumeros.add(30.5);
		listaNumeros.add(40.5);
		listaNumeros.add(50.5);
		listaNumeros.add(60.5);
		listaNumeros.add(70.5);
		listaNumeros.add(80.5);
		listaNumeros.add(90.5);
		listaNumeros.add(100.0);
		
		//imprime o tamanho da lista.
		System.out.println("Tamanho da lista = "+listaNumeros.size());
				
		//Imprimi a lista de números.
		for (Double num : listaNumeros) {
			System.out.println(num);			
		}
		System.out.println("------------------------");
		
		//Adiciona numeros inteiros a lista.
		
		listaInt.add(10);
		listaInt.add(20);
		listaInt.add(30);
		listaInt.add(40);
		listaInt.add(50);
		listaInt.add(60);
		listaInt.add(70);
		listaInt.add(80);
		listaInt.add(90);
		listaInt.add(100);
		
		//imprime o tamanho da lista.
		System.out.println("Tamanho da lista = "+listaInt.size());
		
		//Imprimi a lista de números.
		for (Integer num : listaInt) {
			System.out.println(num);
			
		}
		
		entrada.close();

	}

}
