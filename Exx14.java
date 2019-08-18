package Vetor;

import java.util.Scanner;

public class Exx14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 

		final int TAM2=20;
		float[] vet1 = new float[TAM2];
		float[] vet2 = new float[TAM2];
		float[] vet3 = new float[TAM2];
		
		System.out.println("Insira os numeros do primeiro vetor: ");
		for (int i = 0; i < TAM2; i++) {
			if(i % 2 == 0)
			vet1[i] = entrada.nextFloat();

		}
		System.out.println("Insira os numeros do segundo vetor: ");
		for (int i = 1; i < TAM2; i++) {
			if(i % 2 != 0)
			vet2[i] = entrada.nextFloat();
		}
		System.out.println("Este e o vetor combinado: ");
		for (int i = 0; i < TAM2; i++) {
			if(i % 2 == 0)
			vet3[i] = vet1[i];
			if(i % 2 != 0)
				vet3[i] = vet2[i];
			System.out.println(vet3[i]);
		}
		entrada.close();
	}
}
