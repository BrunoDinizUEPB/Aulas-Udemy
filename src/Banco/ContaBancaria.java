package Banco;

public class ContaBancaria {

	private int numeroDaConta;
	private String nome;
	private double saldo;
	
	
	
	public ContaBancaria (int numeroDaConta, String nome, double depositoInicial) {
		
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public ContaBancaria (int numeroDaConta, String nome) {
		
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		
		saldo += valor;	
		
	}	
	
	public void saque(double valor) {
		
		saldo -= valor + 5.0;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numeroDaConta=" + numeroDaConta 
				+ ", nome=" + nome 
				+ ", saldo=" + saldo + "]";
	}
	

}
