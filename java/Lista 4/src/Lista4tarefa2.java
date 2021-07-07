/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class Lista4tarefa2 {
	public static void main(String [] args)
	{
		// Entradas
		int soma=0, vezes=0, maior=0; 
		int dado[] = new int [10];
		
		// Processamento
		for(int i = 0; i < dado.length; i++) {
			dado[i]=(int) Math.round(Math.random()*10);
			System.out.println("Valor lançado: "+dado[i]);
			
			soma+=dado[i];
			
			if (dado[i] > maior) {
				maior = dado[i];
			}
		}
		
		
		for(int i = 0; i < dado.length; i++) {
			if (dado[i] == maior) {
				vezes++;
			}
		}
		
		// Saidas
		System.out.println("A média aritmética dos dados lançados: "+(soma/dado.length));
		System.out.println("\nO maior valor gerado foi "+maior+", que ocorreu "+vezes+" vezes.");
		
	}	
		
}
