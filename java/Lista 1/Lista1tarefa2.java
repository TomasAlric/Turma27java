  
package Exerc�cios;

import java.util.Scanner;

public class Lista1tarefa2 {

	public static void main(String[] args) {
		int num, anos, meses, dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Diga um n�mero e vamos converter para anos, meses e dias: ");
		num = leia.nextInt();
		
		anos = (num/365);
		meses = (num % 365)/30;
		dias = (num % 365) % 30;
		
		System.out.println("Isso totaliza " + anos + " anos, " + meses + " meses, e " + dias + " dias.");

	}

}