package projetoprojeto;

import java.util.Scanner;

public class matrizidd {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escreva um valor para o tamanho do vetor");

		int[][] matriz = new int[5][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				matriz[i][j] = teclado.nextInt();

			}

		}
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();

		}
		
	}
}