/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

import java.util.Scanner;

public class Lista2tarefa4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float num;

		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();

		if (num % 2 == 0) {

			System.out.println("Esse n�mero � par");
			double raiz = Math.sqrt(num);
			System.out.printf("A raiz quadrada �:  %.2f %n", raiz);

		} else if (num % 2 == 1) {
			System.out.println("Esse n�mero � impar");
			double potencia = Math.pow(num, (2));
			System.out.printf("A pot�ncia �: "+ potencia);
		}

	}   

}
