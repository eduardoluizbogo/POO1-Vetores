package matrizes;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		final int TAM = 10;
		int[] vet = new int[TAM];
		
		System.out.println("Insira 10 numeros: ");
		
		for (int i = 0; i < TAM; i++) {
			vet[i] = entrada.nextInt();
		}	
		for (int j = TAM-1; j >= 0; j--) {
			System.out.println(vet[j]);
		
		}
	entrada.close();
	
	}

}
