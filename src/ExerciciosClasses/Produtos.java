package ExerciciosClasses;

public class Produtos {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEstoque () {
		
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		
		return "Nome do Produto = "+ nome
			   +"\nValor Unitario = $" + String.format("%.2f", preco)
			   +"\nQuantidade Estoque = "+quantidade
			   + "\nValor Total = $"
			   + String.format("%.2f", totalValorEstoque());
	}

}
