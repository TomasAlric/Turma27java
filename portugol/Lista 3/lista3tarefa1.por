programa
{
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.*/
	
	funcao inicio()
	{
		real salario, salarioTotal, mediaSalario, mediaFilhos, filhosTotal, maiorSalario, porcentagem
		inteiro filhos, menorQueCem  

		salario = 0.0
		salarioTotal = 0.0
		mediaSalario = 0.0
		filhos = 0
		filhosTotal = 0.0
		mediaFilhos = 0.0
		maiorSalario = 0.0
		menorQueCem = 0
		porcentagem = 0.0

		para (inteiro i=1;i<=4;i++){
			escreva("Olá, habitante!\n")
			//A
			escreva("Insira o valor de seu salário: ")
			leia(salario)
			salarioTotal += salario

			mediaSalario = salarioTotal/4

			//B
			escreva("Quantos filhos você tem? ")
			leia(filhos)
			filhosTotal += filhos

			mediaFilhos = filhosTotal/4

			//C
			se (salario>maiorSalario){
				maiorSalario = salario
			}

			//V
			se (salario<100.00){
				menorQueCem= menorQueCem + 1
				porcentagem = ((menorQueCem*100)/4)
			}

		}

		escreva("A média salarial é: "+mediaSalario+" R$\n")
		escreva("A média de filhos é: "+mediaFilhos+"\n")
		escreva("O maior salário é: "+maiorSalario+" R$\n")
		escreva("A porcentagem de pessoas que recebem menos de R$100 é: "+(porcentagem)+"%\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */