programa
{
	inclua biblioteca Matematica --> mat 
/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer 	
no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula 
d = raiz( (x2 - x1)^2 + (y2 - y1)^2
que efetua tal cálculo é: 
 */
	funcao inicio()
	{
		real x1,x2,y1,y2
		real resultadox, resultadoy, d

		escreva("Digite o valor de x1 no primeiro ponto: ")
		leia(x1)
		escreva("Digite o valor de x2 no primeiro ponto: ")
		leia(x2)
		escreva("Digite o valor de y1 no primeiro ponto: ")
		leia(y1)
		escreva("Digite o valor de y2 no primeiro ponto: ")
		leia(y2)

		resultadox= mat.potencia ((x2 - x1), 2.0)

		resultadoy= mat.potencia ((y2 - y1), 2.0)

		d = mat.raiz((resultadox + resultadoy), 2.0)

		escreva("A fórmula que efetua tal cálculo é: "+ mat.arredondar(d,2))  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 703; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */