package lista_vetores;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		int[] vet = new int[5];
		
		System.out.print("Insira 5 numeros: ");
		
		for(int i=0; i < vet.length;i++) {
		vet[i] = entrada.nextInt();
		}
		for(int j=0;j < vet.length;j++) {
			System.out.println(vet[j]);
		}
		
		entrada.close();
	}

}
