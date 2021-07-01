programa
{
	/* Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
	e calcule a seguinte expressão:  
	D = (R + S)/2 -- R = (A + B)^2 -- S= (B + C)^2 */
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
		real A, B ,C, R, S, D, valor

		escreva("Digite um número A: ")
		leia(A)
		escreva("Digite um número B: ")
		leia(B)
		escreva("Digite um número C: ")
		leia(C)
		
		R= mat.potencia ((A + B), 2.0)

		S= mat.potencia ((B + C), 2.0)

		D = (R + S)/2
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */