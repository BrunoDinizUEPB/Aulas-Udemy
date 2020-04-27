package ExerciciosClasses;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		Produtos produto = new Produtos ();
		
		System.out.println("Digite os dados do Produto.");
		System.out.printf("Nome do produto.");
		produto.nome = entrada.nextLine();
		System.out.printf("Preço: ");
		produto.preco = entrada.nextDouble();
		System.out.printf("Quantidade: ");
		produto.quantidade = entrada.nextInt();
		
		System.out.println("Dados do Produto: \n"+ produto);
		System.out.println();
		System.out.println("Adiciona produto ");
		int quantidade = entrada.nextInt();
		produto.addProduto(quantidade);
		System.out.println("Dados do Produto: \n"+ produto);
		System.out.println();
		System.out.println("Remover produto ");
		quantidade = entrada.nextInt();
		produto.removeProduto(quantidade);
		System.out.println("Dados do Produto: \n"+ produto);
		
		

	}

}
