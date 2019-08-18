package Vetor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 
		
		//char[] alf = new char[]
		String[] consoante = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
		String[] vogal = {"a","e","i","o","u","a","e","i","o","u","a","e","i","o","u","a","e","i","o","u","a","e","i","o","u","a"};
		int size = 0;
		
		System.out.println("Digite o tamanho da senha: ");
		size = entrada.nextInt();
		
		List<String> y = Arrays.asList(consoante);
		Collections.shuffle(y);

		List<String> z = Arrays.asList(vogal);
		Collections.shuffle(z);

		if(size % 2 == 0) {
			for (int i1=0; i1 < size; i1++) {
				if(i1 % 2 == 0)
					System.out.println(consoante[i1]);
				if(i1 % 2 != 0)
					System.out.println(vogal[i1]);
				}
		}else
			for (int i1=0; i1 < size; i1++) {
				if(i1 == (size-1))
					System.out.println(consoante[i1+5]);
				if(i1 % 2 == 0)
					System.out.println(consoante[i1]);
				if(i1 % 2 != 0)
					System.out.println(vogal[i1]);
				
				}
		entrada.close();
	}

}
