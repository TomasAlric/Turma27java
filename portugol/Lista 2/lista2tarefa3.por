programa
{
	inclua biblioteca Matematica --> mat
/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
	
	funcao inicio()
	{
		real n1,n2,n3,n4
		real q1,q2,q3,q4

		escreva("Digite o número n1: ")
		leia(n1)
		escreva("Digite o número n2: ")
		leia(n2)
		escreva("Digite o número n3: ")
		leia(n3)
		escreva("Digite o número n4: ")
		leia(n4)
			
		q1 = 
mat.potencia (n1, 2.0)
		q2 = mat.potencia (n2, 2.0)
		q3 = mat.potencia (n3, 2.0)
		q4 = mat.potencia (n4, 2.0)

		se (q3>=1000){
			escreva(q3+"\n")
			escreva("FIM DO PROGRAMA")
		}
		senao{
		escreva("\n"+q1+"\n")
		escreva(q2+"\n")
		escreva(q3+"\n")
		escreva(q4+"\n")	
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 842; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */