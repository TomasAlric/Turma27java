/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

import java.util.Scanner;

public class Lista3tarefa5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Insira um n�mero: ");
			num = leia.nextInt();
			soma+=num;
			
		} while(num != 0);
		
		System.out.println("Soma de n�meros digitados at� o n�mero 0: "+soma);

			}
		}

