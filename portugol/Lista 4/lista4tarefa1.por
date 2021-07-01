programa
{
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e 
o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
	
	funcao inicio()
	{
		inteiro nota [5]
		inteiro recebeMaior = 0

		para(inteiro cont = 0; cont <5;cont++)
		{
			escreva("Informe a pontuação: ")
			leia(nota[cont])

			se(recebeMaior<nota[cont])
			{
				recebeMaior = nota[cont]
			}
		}
		para(inteiro cont = 0; cont <5;cont++)
		{
			escreva("\nA pontuação é: "+nota[cont])
			
		}
		
		escreva("\nA maior pontuação foi: "+recebeMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */