programa
{
	
/*Faça um sistema que leia as 3 notas de um aluno e calcule a média 
	final deste aluno. Considerar que a média é ponderada e que o peso das notas é:
	 2,3 e 5, respectivamente.*/
	funcao inicio()
	{
		real n1,n2,n3, media

		escreva("Digite sua nota 1: ")
		leia(n1)
		escreva("Digite sua nota 2: ")
		leia(n2)
		escreva("Digite sua nota 3: ")
		leia(n3)

		media = ((n1*2) + (n2*3) + (n3*5))/(2+3+5)
		escreva(media)

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */