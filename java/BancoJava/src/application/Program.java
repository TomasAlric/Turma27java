package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEmpresarial;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class Program {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		ContaPoupanca cp1 = new ContaPoupanca(1, 30);
		ContaCorrente corrente = new ContaCorrente(1);
		ContaEspecial especial = new ContaEspecial(1, 1000.0);
		ContaEmpresarial empresarial = new ContaEmpresarial(1, 10000.0);
		ContaEstudantil estudantil = new ContaEstudantil (1, 5000.0);
		
		Scanner leia = new Scanner(System.in);
		
		char continua = ' ', creditoFim, retorno = ' ';
		int i = 0, x = 0, operacaoMenu, diaHj = 0, opcao;
		/*double saldo = 0,*/double valor = 0.0;
		
		
		do {
			MenuPrincipal();
			
			System.out.print("Selecione uma operação: ");
			int escolhaMenu = leia.nextInt();
			System.out.println();
			
		
	
			
			switch(escolhaMenu) {
			case 1: //ContaPoupanca();
				
				//nao precisa digitar numero da conta
				
				
				System.out.println("\n------POUPANÇA------");
	
				System.out.println("\nOlá! Bem vinde a conta poupança! ");
	
				for (i = 0 ; i < 10; i++) {
				
					do {
					
						ContaMenu("CONTA POUPANÇA Nº" + 1,
								"", 
								cp1.getSaldo(), 
								"Aniversário da conta dia "+ cp1.getDiaAniversarioPoupanca() + "\n");
						
						System.out.println("Transação " + i + 1);
						System.out.print("Selecione uma operação: ");
						opcao = leia.nextInt();
						if (opcao == 2) {
							
							System.out.print("Qual o valor de crédito: R$");
							valor = leia.nextDouble();
							cp1.deposito(valor);
		
						} else if (opcao == 1) {
							if (cp1.getSaldo() <= 0) {
								System.out.println("Conta sem Saldo");
							} else {
								System.out.printf("Qual o valor de Débito: R$");
								valor = leia.nextDouble();
								cp1.saque(valor);
								while (valor > cp1.getSaldo()) {
									System.out.println("Valor acima do saldo, digite novamente");
									valor = leia.nextDouble();
									cp1.deposito(valor);
									
								}
							}
						}else if (opcao == 0) {
							break;
						}
						
						else {
							System.out.println("Opção inválida!");
						}
						
					}while(opcao < 0 || opcao > 2);
					
				//	continuar transacoes ou sair do for
					do {
						System.out.println();
						cp1.getSaldo();
						System.out.print("Deseja continuar? [S/N]: ");
						continua = leia.next().toUpperCase().charAt(0);
						
						if(continua == 'S') {
							continue;
						}
						else if (continua == 'N') {
							i = 11;
							break;
						}
						
						if (continua != 'S' || continua != 'N') {
							System.out.println("Opção inválida");
						}
							
					}while(continua != 'S' && continua != 'N');
				}
				
				System.out.print("Digite o dia de hoje: ");
				diaHj = leia.nextInt();
				if (diaHj == cp1.getDiaAniversarioPoupanca()) {
					cp1.poupanca(cp1.getDiaAniversarioPoupanca());
					System.out.println("Número da conta: " + cp1.getNumeroConta());
					System.out.println("Hoje é o dia de aniversário da sua conta\n Seu saldo terá um ajuste 5%\n Seu saldo final é de: " + cp1.getSaldo());
				}
				
				
				break;
	
			case 2:
				
				for (i = 0 ; i < 10; i++) {
					
					
					ContaMenu("CONTA-CORRENTE Nº" + 1 , "", corrente.getSaldo(), "");
					
					do {
						System.out.print("Selecione uma operação: ");
						operacaoMenu = leia.nextInt();
						
						switch(operacaoMenu) {
						
						//opcao saque
						case 1: 
							System.out.print("Digite o valor a ser sacado: R$ ");
							double valorSaque = leia.nextDouble();
							corrente.saque(valorSaque);
							break;
						
						//opcao deposito
						case 2: 
							System.out.print("Digite o valor a ser depositado: R$ ");
							double valorDeposito = leia.nextDouble();
							corrente.deposito(valorDeposito);
							break;
						
						case 0:
							System.out.println();
							
							corrente.oferecerTalao();
							break;
							
						default: 
							System.out.println("Opção inválida.\n");
							System.out.println();
						}
					}while(operacaoMenu < 0 || operacaoMenu > 2);
					
					//continuar transacoes ou sair do for
					do {
						System.out.println();
						System.out.print("Deseja continuar? [S/N]: ");
						continua = leia.next().toUpperCase().charAt(0);
						
						if(continua == 'S') {
							continue;
						}
						else if (continua == 'N') {
							i = 11;
							break;
						}
						
						if (continua != 'S' || continua != 'N') {
							System.out.println("Opção inválida");
						}
						
					}while(continua != 'S' && continua != 'N');
					
				}
				
				corrente.oferecerTalao();
				break;
			case 3:
				
				for ( i = 0 ; i < 10; i++) {
					
					ContaMenu("CONTA ESPECIAL Nº " + 1, 
							"3 - LIMITE\n", 
							especial.getSaldo(), 
							"LIMITE: R$ " + String.format("%.2f", especial.getLimiteEspecial()) + "\n");
					
					do {
						System.out.print("Selecione uma operação: ");
						operacaoMenu = leia.nextInt();
					
						switch(operacaoMenu) {
						
						//opcao saque
						case 1: 
							System.out.print("Digite o valor a ser sacado: R$ ");
							double valorSaque = leia.nextDouble();
							especial.saque(valorSaque);
							System.out.println("Saldo  "+especial.getSaldo());
							System.out.println("Limite  " +especial.getLimiteEspecial());
							
							break;
						
							//opcao deposito
						case 2: 
							System.out.print("Digite o valor a ser depositado: R$ ");
							double valorDeposito = leia.nextDouble();
							especial.deposito(valorDeposito);
							
							System.out.printf("Limite: R$%.2f\n", especial.getLimiteEspecial());
							break;
							
						case 3:
							System.out.println();
							System.out.printf("Seu Limite é: R$%.2f\n", especial.getLimiteEspecial());
							System.out.println();
							System.out.println("Para saques utilizar a opção 2 no menu da conta.");
							break;
						case 0:
							System.out.println();
							System.out.println("Obrigado por usar os nossos serviços!");
							System.out.println();
							
							break;
							
						default: 
							System.out.println("Opção inválida.\n");
							
						}
					}while(operacaoMenu < 0 || operacaoMenu > 3);
					
					//continuar transacoes ou sair do for
					do {
						System.out.println();
						System.out.print("Deseja continuar? [S/N]: ");
						continua = leia.next().toUpperCase().charAt(0);
						
						if(continua == 'S') {
							continue;
						}
						else if (continua == 'N') {
							i = 11;
							break;
						}
						
						if (continua != 'S' || continua != 'N') {
							System.out.println("Opção inválida");
						}
						
					}while(continua != 'S' && continua != 'N');
				}
				
				break;
			case 4:			
				
				for (i=1;i<=10;i++) {
					ContaMenu("EMPRESARIAL Nº" + 1,
							"3 - EMPRÉSTIMO\n", 
							empresarial.getSaldo(), 
							"LIMITE: R$ " + String.format("%.2f", empresarial.getLimiteEmpresarial()) + "\n");
					
					do {
						System.out.print("Selecione uma operação: ");
						operacaoMenu = leia.nextInt();
							
						
							if(operacaoMenu == 1) {
								System.out.print("Valor do saque: R$");
								int valorSaqueEmp = leia.nextInt();
								empresarial.saque(valorSaqueEmp);
								System.out.println("\nSaldo: R$"+empresarial.getSaldo());
								System.out.println("Limite Empresarial: R$"+empresarial.getLimiteEmpresarial()+"\n");
							}
							else if (operacaoMenu == 2) {
								System.out.print("Valor do depósito: R$");
								int valorDepositoEmp = leia.nextInt();
								empresarial.deposito(valorDepositoEmp);
								
								System.out.println("Limite Empresarial: R$"+empresarial.getLimiteEmpresarial());
							}
							else if (operacaoMenu == 3) {
								System.out.print("Valor do empréstimo: R$");
								int valorEmprestimoEmp = leia.nextInt();
								empresarial.limiteEmpresarial(valorEmprestimoEmp);
								System.out.println("\nSaldo: R$"+empresarial.getSaldo());
								System.out.println("Limite Empresarial: R$"+empresarial.getLimiteEmpresarial());
							}
							else if (operacaoMenu == 0) {
								break;
							}
							else {
								System.out.println("Opção inválida");
	
							}
					}while(operacaoMenu < 0 || operacaoMenu > 3);
					
						do {
							System.out.println();
							System.out.print("Deseja continuar? [S/N]: ");
							continua = leia.next().toUpperCase().charAt(0);
							
							if(continua == 'S') {
								continue;
							}
							else if (continua == 'N') {
								i = 11;
								break;
							}
							
							if (continua != 'S' || continua != 'N') {
								System.out.println("Opção inválida\n");
							}
							
						}while(continua != 'S' && continua != 'N');
						
						int contador = 1;
						contador++;
						if (contador>=10) {
							System.out.println("O limite de 10 operações diárias foi excedido.");
						}
					}	
					do {
						//System.out.println("O limite de 10 operações diárias foi excedido.");
						System.out.print("Gostaria de realizar um empréstimo? [S/N]");
						
					creditoFim = leia.next().toUpperCase().charAt(0);
					
					if(creditoFim != 'S' && creditoFim != 'N') {
						
						
						System.out.println("\nOpção inválida\n\n");
						//System.out.println("Gostaria de realizar um empréstimo? [S/N]");
						//creditoFim = leia.next().toUpperCase().charAt(0);
						}
					
					else if (creditoFim == 'S') {
						System.out.println("Valor do empréstimo: R$");
						int valorEmprestimoEmp = leia.nextInt();
						empresarial.limiteEmpresarial(valorEmprestimoEmp);
						System.out.println("\nSaldo: R$"+empresarial.getSaldo());
						System.out.println("Limite Empresarial: R$"+empresarial.getLimiteEmpresarial());
					}
					else if (creditoFim == 'N') {
						break;
					}
					
					}while(creditoFim != 'S' && creditoFim != 'N');
	
					break;
			case 5:
				
				for (i=1;i<=10;i++) {
					ContaMenu("ESTUDANTIL Nº" + 1,
							"3 - LIMITE ESTUDANTIL\n",
							estudantil.getSaldo(), 
							"LIMITE: R$ " + String.format("%.2f", estudantil.getLimiteEstudantil()) + "\n");
					
					do {
						System.out.print("Selecione uma operação: ");
						operacaoMenu = leia.nextInt();
							
						
							if(operacaoMenu == 1) {
								System.out.print("Valor do saque: R$");
								int valorSaqueEst = leia.nextInt();
								estudantil.saque(valorSaqueEst);
								System.out.println("\nSaldo: R$"+estudantil.getSaldo());
								System.out.println("Limite Estudantil: R$"+estudantil.getLimiteEstudantil()+"\n");
							}
							else if (operacaoMenu == 2) {
								System.out.print("Valor do depósito: R$");
								int valorDepositoEst = leia.nextInt();
								estudantil.deposito(valorDepositoEst);
								
								System.out.println("Limite Estudantil: R$"+estudantil.getLimiteEstudantil());
							}
							else if (operacaoMenu == 3) {
								System.out.print("Valor do empréstimo: R$");
								int valorEmprestimoEst = leia.nextInt();
								estudantil.limiteEstudantil(valorEmprestimoEst);
								System.out.println("\nSaldo: R$"+estudantil.getSaldo());
								System.out.println("Limite Estudantil: R$"+estudantil.getLimiteEstudantil());
							}
							else if (operacaoMenu == 0) {
								break;
							}
							else {
								System.out.println("Opção inválida");
	
							}
					}while(operacaoMenu < 0 || operacaoMenu > 3);
					
						do {
							System.out.println();
							System.out.print("Deseja continuar? [S/N]: ");
							continua = leia.next().toUpperCase().charAt(0);
							
							if(continua == 'S') {
								continue;
							}
							else if (continua == 'N') {
								i = 11;
								break;
							}
							
							if (continua != 'S' || continua != 'N') {
								System.out.println("Opção inválida\n");
							}
							
						}while(continua != 'S' && continua != 'N');
						
						int contador = 1;
						contador++;
						if (contador>=10) {
							System.out.println("O limite de 10 operações diárias foi excedido.");
						}
					}	
					do {
						//System.out.println("O limite de 10 operações diárias foi excedido.");
						System.out.print("Gostaria de utilizar o valor do Limite Estudantil? [S/N]");
						
					creditoFim = leia.next().toUpperCase().charAt(0);
					
					if(creditoFim != 'S' && creditoFim != 'N') {
						
						
						System.out.println("\nOpção inválida\n\n");
						//System.out.println("Gostaria de realizar um empréstimo? [S/N]");
						//creditoFim = leia.next().toUpperCase().charAt(0);
						}
					
					else if (creditoFim == 'S') {
						System.out.println("Valor do empréstimo: R$");
						int valorEmprestimoEst = leia.nextInt();
						estudantil.limiteEstudantil(valorEmprestimoEst);
						System.out.println("\nSaldo: R$"+estudantil.getSaldo());
						System.out.println("Limite Estudantil: R$"+estudantil.getLimiteEstudantil());
					}
					else if (creditoFim == 'N') {
						break;
					}
					
					}while(creditoFim != 'S' && creditoFim != 'N');
					
					break;
			case 6:
				System.out.println("OBRIGADO POR USAR O BANZZAI BANK!");
				
				break;
			default: 
				System.out.println("Opção inválida.\n");
				break;
			}
			System.out.print("Retorna ao inicio [S/N]: ");
			retorno = leia.next().toUpperCase().charAt(0);
		}while(retorno == 'S');
		
		System.out.println("Obrigado por usar os nossos serviços!");
		
		leia.close();
		
		
	}
	
	public static void MenuPrincipal () {
		

		
		System.out.println("------BANZZAI------");
		System.out.println("--時間は私たちの保証です--");
		
		System.out.println();
		System.out.println("===================");
		System.out.println("1 - CONTA POUPANÇA");
		System.out.println("2 - CONTA CORRENTE");
		System.out.println("3 - CONTA ESPECIAL");
		System.out.println("4 - CONTA EMPRESARIAL");
		System.out.println("5 - CONTA ESTUDANTIL");
		System.out.println("6 - SAIR");
		System.out.println("==================="); 
		System.out.println();
		
	}

	
	
	public static void ContaMenu (String tipoConta, String x, double saldo, String plus) {

		System.out.println();
		System.out.println("-------BANZZAI------");
		System.out.println("--時間は私たちの保証です--");
		System.out.println();
		System.out.println(tipoConta);
		System.out.println();
		System.out.printf("SALDO: R$ %.2f\n", saldo);
		System.out.printf(plus);
		System.out.println("===================");
		System.out.println("1 - SAQUE");
		System.out.println("2 - DEPÓSITO");
		System.out.print(x);
		System.out.println("0 - VOLTAR AO MENU");
		System.out.println("===================");
		System.out.println();
		
		
	}
		
}	
