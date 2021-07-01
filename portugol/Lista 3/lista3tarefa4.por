programa
{
/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
(imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
deveremos observar na tela a seguinte sequência: 5 15 45 135. */

	
	funcao inicio()
	{
		inteiro numero = 0, valor = 0
		
		escreva("Digite um número: ")
		leia(numero)
		
		enquanto(valor<100)
		{
			valor=numero*3
			numero=valor	
			escreva("\n"+valor)
			
		}
		escreva("\nFIM DE PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */