programa
{
/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos 	
de três e que se encontram no conjunto dos números de 1 até 500.
 */
	funcao inicio()
	{
		inteiro numero = 0, soma = 0

		para(numero;numero<=500;numero++)
		{
			se(numero%2==1 e numero%3==0){
				soma=soma+numero

				escreva(soma)
				escreva("\n")
					
			}
		
		}
		escreva("\nFIM DE PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */