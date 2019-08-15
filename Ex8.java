package matrizes;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int TAM=5;
		int[] vet = new int[TAM];
		int soma=0;
		int mult=1;
		
		System.out.println("Insira 5 números inteiros: ");
		
		for (int i = 0; i < TAM; i++) {
			vet[i] = entrada.nextInt();
			soma += vet[i];
			mult = mult * vet[i]; 
			
		}
		for (int i = 0; i < TAM; i++) {
		System.out.println(vet[i]);
		
		}
		System.out.println("A soma é: "+soma);
		System.out.println("A multiplicação é: "+mult);
		
		entrada.close();

	}

}
