/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

import java.util.Scanner;

public class Lista3tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, totalPar = 0, totalImpar = 0, totalInvalido = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Insira um número: ");
			num = leia.nextInt();
			
			if (num > 0) {
				if (num%2==0) {
					totalPar++;
				} else {
					totalImpar++;
				}
			} else {
				System.out.println("Número inválido.");
				totalInvalido++;
			}
		}
		
		System.out.println("O total de números pares: "+totalPar);
		System.out.println("O total de números ímpares: "+totalImpar);
		System.out.println("O total de números inválidos: "+totalInvalido);

	}

}
