package entities;

public class ContaEspecial extends Conta {

	private double limiteEspecial;

	public ContaEspecial(int numeroConta, double limiteEspecial) {
		super(numeroConta);
		this.limiteEspecial = limiteEspecial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public  void  usarLimite (double valorDif) {
		
		this.limiteEspecial = this.limiteEspecial - valorDif;
	}
		
	
	@Override
	
		public void saque (double valorSaque) {
			if(valorSaque <= 0) {
				System.out.println("Operação inválida.");
		}
		
		else if (valorSaque > (saldo+limiteEspecial)) {
			System.out.println("Não possui valor para essa operação!");
		}
		
		
		else if(valorSaque >saldo && valorSaque <= limiteEspecial) {
			double valorDif = valorSaque - this.saldo;
			this.saldo = this.saldo -(valorSaque - valorDif);
			usarLimite(valorDif);
		
		
		}
		
		else if (saldo <= valorSaque){
			this.saldo -= valorSaque;
			System.out.println("Operação realizada com sucesso.");
		}
		
	
	
	}
}