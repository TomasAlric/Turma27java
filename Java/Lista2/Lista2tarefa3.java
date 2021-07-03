/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto */
import java.util.Scanner;

public class Lista2tarefa3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade = 0;

		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade < 0)
			System.out.println("Você ainda não nasceu!");
		else if (idade < 10) {
			System.out.println("Você é um bebê =D");
		}
		else if (idade >= 10 && idade <= 14) {
			System.out.println("Você se encontra na categoria infantil!");

		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Você se encontra na categoria juvenil!");
		} else
			System.out.println("Você se encontra na categoria adulto!");
	}
}
