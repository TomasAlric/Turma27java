/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;

public class Lista2tarefa4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float num;

		System.out.print("Digite um número: ");
		num = leia.nextInt();

		if (num % 2 == 0) {

			System.out.println("Esse número é par");
			double raiz = Math.sqrt(num);
			System.out.printf("A raiz quadrada é:  %.2f %n", raiz);

		} else if (num % 2 == 1) {
			System.out.println("Esse número é impar");
			double potencia = Math.pow(num, (2));
			System.out.printf("A potência é: "+ potencia);
		}

	}   

}
