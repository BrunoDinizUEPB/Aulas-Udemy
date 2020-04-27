package ExerciciosVetorArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionarioMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>(); 
		
		
		System.out.print("Informe a quantidade de cadastros = ");
		int n = entrada.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionario # "+i+" : ");
			
			System.out.print("Informe o ID = ");
			int id = entrada.nextInt();
			
			while(hasId(lista, id)) {
				System.out.print("Id já foi usado. Tente novamente: ");
				id = entrada.nextInt();
				
			}
			
			System.out.print("Informe o nome = ");
			entrada.nextLine();
			String nome = entrada.nextLine();	
			
			System.out.print("Informe o salario = ");
			Double salario = entrada.nextDouble();
			
			lista.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println();
		
		System.out.println(lista);
		
		System.out.println("#################################");
		
		System.out.println();
		System.out.print("Informe o id do funcionario que vai ter aumento = ");
		int id = entrada.nextInt();
		
		// Realiza a pesquisa do id na lista de funcionario.
		Funcionario emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			
			System.out.println("Id não existe !");
			
		}
		else {
			
			System.out.println("Informe o valor em % = ");
			double taxa = entrada.nextDouble();
			emp.acrecimoSalario(taxa);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios cadastrados.");
		
		for(Funcionario x : lista) {
			
			System.out.println(x);
		}
	
		
		
		
		
		entrada.close();
	}

	private static boolean hasId(List<Funcionario> lista, int id) {
		Funcionario emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
