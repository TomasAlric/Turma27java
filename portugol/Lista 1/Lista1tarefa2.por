programa
{
	/* Faça um sistema que leia a idade de uma pessoa expressa em dias 
	e mostre-a expressa em anos, meses e dias.*/ 
	funcao inicio()
	{
		inteiro idade, anos, meses, dias

		escreva("Digite sua idade em dias: ")
		leia(idade)
		

		anos = idade/365
		meses = (idade%365)/30
		dias = (idade%365)%30 

		escreva("O valor em anos é: "+anos)
		escreva("\nO valor em meses é: "+meses)
		escreva("\nO valor em dias é: "+dias)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */