package entities;

import java.util.Scanner;

public class ContaEstudantil extends Conta {
	
	private double valorLimiteSaldoInsuficiente = 0.00;
	private double limiteEstudantil;
	Scanner leia = new Scanner(System.in);

	public ContaEstudantil(int numeroConta, double limiteEstudantil) {
		super(numeroConta);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	@Override
	public void saque (double valorSaque) {
		if(valorSaque <= 0) {
			System.out.println("Operação inválida.");
		}
		
		else if (valorSaque>saldo  && limiteEstudantil < (valorSaque - saldo)) {
			System.out.println("Saldo insuficiente.");
		}
		
		else if (valorSaque>saldo && limiteEstudantil >= (valorSaque - saldo)) {
			System.out.println("\nSaldo insuficiente.\nGostaria de usar o Limite Estudantil para completar a transação? [S/N]: ");
			char usarLimite = leia.next().toUpperCase().charAt(0);
				if (usarLimite == 'S') {
				valorLimiteSaldoInsuficiente = saldo - valorSaque;
				limiteEstudantil += valorLimiteSaldoInsuficiente;
				saldo = 0.00;
				System.out.println("\nTransação realizada com sucesso.");
				}
				else if (usarLimite == 'N') {
					System.out.println("\nTransação cancelada.");
				}
				
				else {
					System.out.println("\nOpção inválida, cancelando transação.");
				}
				
		}
		else {
		this.saldo -= valorSaque;
		System.out.println("Operação realizada com sucesso.");
		}
	}
	
	public void limiteEstudantil (double valorLimiteEstudantil) {
		if(valorLimiteEstudantil <= 0) {
			System.out.println("Operação inválida.");
		}
		
		else if(valorLimiteEstudantil > limiteEstudantil) {
			System.out.println("Operação inválida.\nLimite Estudantil: R$"+limiteEstudantil);
		}
		
		else {
			saldo += valorLimiteEstudantil;
			limiteEstudantil -= valorLimiteEstudantil;
		}
		
		
	}
}