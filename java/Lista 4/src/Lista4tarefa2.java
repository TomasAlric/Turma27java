/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

public class Lista4tarefa2 {
	public static void main(String [] args)
	{
		// Entradas
		int soma=0, vezes=0, maior=0; 
		int dado[] = new int [10];
		
		// Processamento
		for(int i = 0; i < dado.length; i++) {
			dado[i]=(int) Math.round(Math.random()*10);
			System.out.println("Valor lan�ado: "+dado[i]);
			
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
		System.out.println("A m�dia aritm�tica dos dados lan�ados: "+(soma/dado.length));
		System.out.println("\nO maior valor gerado foi "+maior+", que ocorreu "+vezes+" vezes.");
		
	}	
		
}
