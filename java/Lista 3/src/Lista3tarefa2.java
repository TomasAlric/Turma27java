/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

import java.util.Scanner;

public class Lista3tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, totalPar = 0, totalImpar = 0, totalInvalido = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Insira um n�mero: ");
			num = leia.nextInt();
			
			if (num > 0) {
				if (num%2==0) {
					totalPar++;
				} else {
					totalImpar++;
				}
			} else {
				System.out.println("N�mero inv�lido.");
				totalInvalido++;
			}
		}
		
		System.out.println("O total de n�meros pares: "+totalPar);
		System.out.println("O total de n�meros �mpares: "+totalImpar);
		System.out.println("O total de n�meros inv�lidos: "+totalInvalido);

	}

}
