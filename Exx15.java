package Vetor;

import java.util.Scanner;

public class Exx15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM1=3;
		final int TAM2=2;
		float[][] vet = new float[TAM1][TAM2];
		float mediaaltura =0;
		int cont=0;
		int quant=0;

		for (int i = 0; i < TAM1; i++) {
			for (int j = 0; j < TAM2; j++) {
				if(j == 0) {
			System.out.println("Insira a sua idade: ");
			vet[i][j] = entrada.nextFloat();
				}
			if(j == 1) {
				System.out.println("Insira a sua altura: ");
			vet[i][j] = entrada.nextFloat();
			mediaaltura += vet[i][j];
			cont++;
			}

		}
	}
		
		mediaaltura = mediaaltura / cont;
		System.out.println("A media é: "+mediaaltura);

		for (int i = 0; i < TAM1; i++) {
				if(vet[i][0] >13)
					if(vet[i][1] > mediaaltura)
						quant++;
				
			}
			System.out.println("A media é: "+mediaaltura);
			System.out.println("A quantidade é: "+quant);
			
			entrada.close();
			}
		
		
	}


