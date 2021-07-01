programa
{
	/*PEDI A TEMPERATURA EM CELSIUS, MOSTRA O NOME DA PESSOA E A TEMPERATURA 
	EM FARENHEIT8*/
	funcao inicio()
	{
		cadeia nome = ""
		real temp
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite a sua temperatura em Celsius: ")
		leia(temp)
		temp = (temp*1.8) + 32
		escreva(nome + " sua temperatura em Farenheit é: "+ temp)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */