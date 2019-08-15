package lista_vetores;

import java.util.Scanner;

public class Exx12 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);

		String palavras=" ";
		
		System.out.println("Insira palavras separadas por ; ");
		palavras = entrada.next();
		
		String[] vet = palavras.split(";");
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		entrada.close();
	}

}
