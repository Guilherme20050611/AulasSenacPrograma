package aula2807;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int tamanho = Teclado.nextInt();
		
		double[] vetor = new double[tamanho];
		for (int i = 0; i < tamanho; i++);{
			int i = 0;
			System.out.println("Digite o valor" + (i + 1) + ": ");
			 vetor[i] = Teclado.nextDouble();		}
		
	
		double media = calcularMedia(vetor);
		System.out.println("O valor da média é " + media);
		
		Teclado.close();
	}

	public static double calcularMedia (double[] vetor) {
		double soma = 0;
		for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }
				
	}
	
		
	

