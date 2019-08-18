package Vetor;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 
	
		final int TAM=20;
		int[] vet=new int[TAM];
		int[] par=new int[TAM];
		int[] impar=new int[TAM];

		System.out.println("Insira 20 numeros: ");
		
		for (int i = 0; i < TAM; i++) {
			vet[i] = entrada.nextInt();
			if(vet[i] % 2 == 0)
				par[i] = vet[i];
			if(vet[i] % 2 != 0)
				impar[i] = vet[i];
		}
		
		System.out.println("Vetor completo: ");
		for (int i = 0; i < TAM; i++) {
			System.out.println(vet[i]);
			
		}
		
		System.out.println("Vetor par: ");
		for (int i = 0; i < TAM; i++) {
			if(par[i] != 0)
			System.out.println(par[i]);
		}
		
		System.out.println("Vetor impar: ");
		for (int i = 0; i < TAM; i++) {
			if(impar[i] != 0)
			System.out.println(impar[i]);
		}
		entrada.close();
	}

}
