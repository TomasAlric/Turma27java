programa
{
/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa 
em segundos e mostre-o expresso em horas, minutos e segundos.*/	

	funcao inicio()
	{
		inteiro tempoEvento, horas, minuto, segundo

		escreva("Digite o tempo de duração do evento[segundos]: ")
		leia(tempoEvento)

		horas = tempoEvento /3600
		minuto = (tempoEvento % 3600) / 60
		segundo = (tempoEvento % 3600) % 60

		escreva("Horas: " +horas+ "\n")
		escreva("Minutos: " +minuto+ "\n")
		escreva("Segundos: " +segundo+ "\n")

		escreva("FIM DE PROGRAMA")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */