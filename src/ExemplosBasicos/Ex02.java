package ExemplosBasicos;

public class Ex02 {

	public static void main(String[] args) {

		int A, B, aux;
		
		A = 10;
		B = 15;
		
		System.out.println("Valor de A = "+ A + "\nValor de B = "+B);
		
		aux = B;
		B = A;
		A = aux;
		
		System.out.println("Valor de A = "+ A + "\nValor de B = "+B);             
	}

}
