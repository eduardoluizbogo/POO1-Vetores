package matrizes;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		float[] vet = new float[4];
		float soma = 0;
		float media = 0;
		
		System.out.println("Insira 4 notas: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.nextFloat();
			soma += vet[i];
		}
		for (int i = 0; i < vet.length; i++) {
			System.out.println("A nota "+i+" é: "+vet[i]);
		}
		media = soma / 4;
		System.out.println("A média é: "+media);
	
		entrada.close();
	}

}
