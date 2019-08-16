package Vetor;

import java.util.Scanner;

public class Exx16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int TAM=3;
		float[] vet =new float[TAM];
	
		System.out.println("Informe números no intervalo de 0-20: ");
		for (int i = 0; i < TAM; i++) {
			do {
				vet[i] = entrada.nextFloat();
				if(vet[i] < 0 || vet[i] > 20)
					System.out.println("O numero nao está no intervalo, digite novamente: ");
			}while(vet[i] < 0 || vet[i] > 20);
			}
			for (int j = 0; j < vet[0]; j++) {
				if(j==0) {
				System.out.print(vet[0]+": ");
				}
				System.out.print("#");
			}
			System.out.println("\n");

			for (int j = 0; j < vet[1]; j++) {
				if(j==0) {
				System.out.print(vet[1]+": ");
				}
				System.out.print("#");
			}
			System.out.println("\n");

			for (int j = 0; j < vet[2]; j++) {
				if(j==0) {
				System.out.print(vet[2]+": ");
				}
				System.out.print("#");
			}
			
		entrada.close();
	
	}

}
