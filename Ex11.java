package matrizes;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String data = " ";
		int[] vetdia = new int[3];
		
		System.out.println("Insira uma data no padrão dd/mm/aaaa: ");
		data = entrada.next();
		
		boolean dataver=false;
		
		String diaS = data.substring(0,2);
		String mesS = data.substring(3,5);
		String anoS = data.substring(6,10);
	
		int dia1 = Integer.parseInt(diaS);
		int mes1 = Integer.parseInt(mesS);
		int ano1 = Integer.parseInt(anoS);
		
		vetdia[0] = dia1;
		vetdia[1] = mes1;
		vetdia[2] = ano1;

		
		if(mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 ||mes1 == 12) {
			if(dia1 <= 31)
				dataver=true;
		}
		if(mes1 == 4 || mes1 == 2 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
			if(dia1 <= 30)
				dataver=true;
		}
		
		if(dataver)
			System.out.println("A data e valida!");
		else
			System.out.println("A data nao e valida!");
		
		entrada.close();
	}

}
