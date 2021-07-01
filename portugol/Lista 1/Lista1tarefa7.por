programa
{
/* Um sistema de equações lineares do tipo ax + by = c, dx + ey = f
 pode ser resolvido segundo mostrado abaixo
 x = (ce-bf)/(ae-bd) ---- y = (af-cd)/(ae-bd)
Escreva um sistema que lê os coeficientes a,b,c,d,e e f
 e calcula e mostra os valores de x e y.

 
 */
	funcao inicio()
	{
		real A,B,C,D,E,F,X,Y

		escreva("Digite um valor para A: ")
		leia(A)
		escreva("Digite um valor para B: ")
		leia(B)
		escreva("Digite um valor para C: ")
		leia(C)
		escreva("Digite um valor para D: ")
		leia(D)
		escreva("Digite um valor para E: ")
		leia(E)
		escreva("Digite um valor para F: ")
		leia(F)
		
		X = ((C*E) - (B*F))/((A*E) - (B*D))

		Y = ((A*F) - (C*D))/((A*E) - (B*D))

		escreva("\nO valor de X é: "+X)
		escreva("\nO valor de Y é: "+Y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 750; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */