/*Faça um programa que entre com três números e coloque em ordem crescente.*/

import java.util.Scanner;

public class Lista2tarefa2 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite A:");
		a = leia.nextInt();

		System.out.println("Digite B:");
		b = leia.nextInt();

		System.out.println("Digite C:");
		c = leia.nextInt();

		if (a == b && b == c) {
			System.out.printf(" %d - %d - %d", a, b, c);
		} else if (a > b && b > c) {
			System.out.printf(" %d - %d - %d", c, b, a);
		}
		  else if (a > c && c > b) {
			System.out.printf(" %d - %d - %d", a, c, b);
		}
	}
}