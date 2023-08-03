
package novaPackage;

import java.util.Arrays;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		// usuario insere o tamanho do vetor, depois cria o vetor e o usuario insere
		// cada valor, depois percorre o vetor e soma todos os elementos

		// declarando novo scanner com o nome teclado
		Scanner teclado = new Scanner(System.in);

		// saida na tela "texto"
		System.out.println("Insira o tamanho do vetor: ");

		// declarando variavel do tipo INT com o nome ORDEM
		// que RECEBE o valor que o usuario inserir
		int ordem = teclado.nextInt();

		// declarando uma variavel VETOR do tipo INT
		// com o nome vetorNumerosInteiros
		// que RECEBE uma nova instancia
		// "novo vetor" de tamanho ORDEM
		int[] vetorNumerosInteiros = new int[ordem];

		// saida na tela "texto" CONCATENA com a VARIAVEL ordem
		System.out.println("Ordem do vetor: " + ordem);

		// saida na tela "texto" CONCATENA funcao que retorna o tamanho do vetor
		//
		System.out.println(".length: " + vetorNumerosInteiros.length);

		// mostrar um vetor inteiro na tela:
		// import Arrays lá em cima
		System.out.println(Arrays.toString(vetorNumerosInteiros));

		// usuario inserir cada valor do vetor
		Scanner arroz = new Scanner(System.in);

		// for pro usuário inserir cada valor
		for (int posicao = 0; posicao < vetorNumerosInteiros.length; posicao++) {
			System.out.println("Insira o elemento: " + posicao);
			// elemento atual pede pro usuario uma int
			vetorNumerosInteiros[posicao] = arroz.nextInt();
		}

		// mostrar a soma de todos valor do vetor

		// declara variavel soma recebe 0
		int soma = 0;

		for (int i = 0; i < vetorNumerosInteiros.length; i++) {

			soma += vetorNumerosInteiros[i];

			// variavel recebe valor novo = valor antigo + elemento atual
			// soma = soma + vetorNumerosInteiros[i];
		}

		System.out.println("A soma do vetor é: " + soma);
	}

}
