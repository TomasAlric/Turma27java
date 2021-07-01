programa
{
	/*Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	meses e dias e mostre-a expressa apenas em dias.*/ 
	
	funcao inicio()
	{
		
		inteiro idade, anos, meses, dias

		escreva("Digite sua idade em anos: ")
		leia(anos)
		escreva("Digite sua idade em meses: ")
		leia(meses)
		escreva("Digite sua idade em dias: ")
		leia(dias)	

		idade = (anos*365) + (meses*30) + (dias)
		escreva("O valor em dias é: " +idade)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */