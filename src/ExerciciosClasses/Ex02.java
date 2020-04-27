package ExerciciosClasses;

public class Ex02 {

	public String nome;
	public double salarioBruto;
	public double imposto;
	public double taxaAumento;
	
	public double salario() {
		
		return salarioBruto - imposto;
	}
	
	public void salarioNovo (double taxaAumento) {
		
		salarioBruto += salarioBruto * taxaAumento / 100;
	}
	
	public String toString() {
		
		return "Nome = " +nome+ "\nSalario Brunto = $ "+ salario();
	}
	
	
}
