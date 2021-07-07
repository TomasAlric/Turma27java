/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
public class Lista4tarefa1 {
	public static void main(String[] args) {

		// Entradas
		int pontuacao[] = new int[5];
		int maior = 0;

		// Processamento
		for (int i = 0; i < pontuacao.length; i++) {
			pontuacao[i] = (int) Math.round(Math.random() * 20);
			System.out.println(pontuacao[i]);
			if (pontuacao[i] > maior) {
				maior = pontuacao[i];
			}
		}
		// Saidas
		System.out.println("O maior valor é " + maior);

	}

}
