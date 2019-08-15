package matrizes;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int TAM=5;
		int[] vet = new int[TAM];
		int soma=0;
		int media=0;
		int maior=0;
		int menor=0;
		
		
		System.out.println("Insira 5 numeros: ");
		
		for (int i = 0; i < TAM; i++) {
			vet[i] = entrada.nextInt();
			if(i == 0) {
				maior = vet[i];
				menor = vet[i];
			}
		
			soma += vet[i];
		}
			for (int i = 0; i < TAM; i++) {
			if(vet[i] % 2 == 0) {
				System.out.println("O "+vet[i]+" e par");
			}else {
				System.out.println("O "+vet[i]+" e ímpar");
			}
		}
			
		System.out.println("A soma e: "+soma);
		
		media = soma / TAM;
		
		System.out.println("A media e: "+media);
		
		for (int i = 0; i < TAM; i++) {
			if(vet[i] > media)
				System.out.println("Numero acima da media: "+vet[i]);
			else if(vet[i] < media)
				System.out.println("Numero abaixo da media: "+vet[i]);

			
		}
		entrada.close();
	}

}
