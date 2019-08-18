package Vetor;

import java.util.Scanner;

public class Exx10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 

		String texto= " ";
		
		System.out.println("Insira um texto: ");
		texto = entrada.next();
		
		char b[] = texto.toCharArray();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
	
		}
		entrada.close();
	}

}
