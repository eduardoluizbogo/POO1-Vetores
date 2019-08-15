package matrizes;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int cont=0;
		char[] vet = new char[10];
		
		System.out.println("Insira 10 letras");
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.next().charAt(0);
		}
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] == 'a' || vet[i] == 'e' || vet[i] == 'i' || vet[i] == 'o' || vet[i] == 'u') {
			}else {
				cont++;
				System.out.println(vet[i]);
			}
		}
		System.out.println(cont+" consoantes foram inseridas!");
		
		entrada.close();
	}
}
