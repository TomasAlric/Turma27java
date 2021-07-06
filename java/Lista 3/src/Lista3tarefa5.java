/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

import java.util.Scanner;

public class Lista3tarefa5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Insira um número: ");
			num = leia.nextInt();
			soma+=num;
			
		} while(num != 0);
		
		System.out.println("Soma de números digitados até o número 0: "+soma);

			}
		}

