programa
{
	
	funcao inicio()
	{
	inteiro ano,idade
	cadeia nome
	
	escreva("Digite seu nome: ")
	leia(nome)
	escreva("Digite seu ano de nascimento: ")
	leia(ano)

	idade = 2021 - ano
	
	se(idade>35)
	{
		escreva(nome + "\nSua idade é: " +idade+ "\nCringe!\n")
	}
	
	escreva("FIM DO PROGRAMA")	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */