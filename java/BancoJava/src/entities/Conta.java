package entities;

public abstract class Conta {
	
	private String titular;
	private int numeroConta;
	protected double saldo;
	
	
	public Conta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito (double valorDeposito){
		if(valorDeposito <= 0) {
			System.out.println("Operação inválida.");
		}
		else {
		this.saldo += valorDeposito;
		System.out.println("Deposito realizado com sucesso.");
		System.out.println();
		System.out.printf("Saldo atual: R$ %.2f\n", saldo);
		}
	}
	
	public void saque (double valorSaque) {
		if(valorSaque <= 0) {
			System.out.println("Operação inválida.");
		}
		else if (valorSaque>saldo) {
			System.out.println("Saldo insuficiente.");
		}
		else {
		this.saldo -= valorSaque;
		System.out.println("Operação realizada com sucesso.");
		System.out.println();
		System.out.printf("Saldo atual: R$ %.2f", saldo);
		}
	}
}