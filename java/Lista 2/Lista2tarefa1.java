/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/


import java.util.Scanner;

public class Lista2tarefa1 {
	public static void main(String args[]) {   

	       Scanner read = new Scanner(System.in);

	       int a = read.nextInt();

	       int maior = a;

	       int b = read.nextInt();

	       maior = maior > b ? maior : b;

	       int c = read.nextInt();

	       maior = maior > c ? maior : c;

	       System.out.println("Maior: " + maior);

	   }
}
