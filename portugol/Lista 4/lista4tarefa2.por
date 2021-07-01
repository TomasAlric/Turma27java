programa
{
	inclua biblioteca Util
/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que 
gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética 
dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/

	funcao inicio()
	{
		inteiro dado [10], maiorValor = 0, repeteMaior = 0
		real mediaTotal, totalDado = 0.0

		para(inteiro i = 0; i < 6; i++){
			dado[i] = Util.sorteia(1,6)
			totalDado+=dado[i]

			se (dado[i] > maiorValor){
				maiorValor = dado[i]
			}

			escreva((i+1)+"° - valor: "+dado[i]+"\n")
		}

		para(inteiro i = 0; i < 10; i++){
			se (dado[i] == maiorValor){
				repeteMaior++
			}
		}

		mediaTotal = (totalDado/10)
		
		escreva("\nA média aritmética dos resultados dos dados é: "+mediaTotal)
		escreva("\nO maior valor gerado foi "+maiorValor+", que ocorreu "+repeteMaior+"x.")

		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */