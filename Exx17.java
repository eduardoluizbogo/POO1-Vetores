package Vetor;

import java.util.Scanner;

public class Exx17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int select=0;
		
		int aux=0;
		final int infos=5;
		final int pessoas=2;
		String[][] agenda = new String[pessoas][infos];
		String comp=" ";
		do {
		
		System.out.println("Selecione uma opção: \n1-Inclusão\n2-Alteração\n3-Consulta\n4-Relatório\n5-Exclusão");
		select = entrada.nextInt();
			
		switch(select) {
		case 1: 
			for (int i = 0; i < pessoas; i++) {				
				System.out.println("Contato "+(i+1)+": ");
					System.out.print("Nome? ");
					agenda[i][0] = entrada.next();
					System.out.print("Telefone? ");
					agenda[i][1] = entrada.next();
					System.out.print("Celular? ");
					agenda[i][2] = entrada.next();
					System.out.print("E-mail? ");
					agenda[i][3] = entrada.next();
					System.out.print("Data de nascimento? ");
					agenda[i][4] = entrada.next();
					System.out.println("\n");			
				}	
			break;
		case 2: 
			System.out.println("Alteração");
			comp = entrada.next();
			for (int i = 0; i < pessoas ; i++) {
			if(agenda[i][1].equals(comp)) {
				aux = i;
				}}
				System.out.println("Contato "+(aux+1)+": ");
				System.out.print("Nome? ");
				agenda[aux][0] = entrada.next();
				System.out.print("Telefone? ");
				agenda[aux][1] = entrada.next();
				System.out.print("Celular? ");
				agenda[aux][2] = entrada.next();
				System.out.print("E-mail? ");
				agenda[aux][3] = entrada.next();
				System.out.print("Data de nascimento? ");
				agenda[aux][4] = entrada.next();
				System.out.println("\n");
			break;
		case 3: 
			System.out.println("Consulta");
			for (int i = 0; i < pessoas; i++) {
				System.out.println("Contato "+(i+1)+": ");
				for (int j = 0; j < infos; j++) { 
					if(j == 0)
						System.out.println("Nome- "+agenda[i][j]);
					if(j == 1)
						System.out.println("Telefone- "+agenda[i][j]);
					if(j == 2)
						System.out.println("Celular- "+agenda[i][j]);
					if(j == 3)
						System.out.println("E-mail- "+agenda[i][j]);
					if(j == 4)
						System.out.println("Data de nascimento- "+agenda[i][j]+"\n");
					
				}
			}
			break;
		case 4: 
			for (int i = 0; i < pessoas; i++) {
				System.out.println("Contato "+(i+1)+": ");
				for (int j = 0; j < infos; j++) { 
					if(j == 0)
						System.out.println("Nome- "+agenda[i][j]);
					if(j == 1)
						System.out.println("Telefone- "+agenda[i][j]);
					if(j == 2)
						System.out.println("Celular- "+agenda[i][j]);
					if(j == 3)
						System.out.println("E-mail- "+agenda[i][j]);
					if(j == 4)
						System.out.println("Data de nascimento- "+agenda[i][j]+"\n");	
				}
			}
			break;
		case 5: 
			for (int i = 0; i < pessoas; i++) {
				for (int j = 0; j < infos; j++) { 
					agenda[i][j] = null;
				}
			}
			break;
			
		}
		}while(select != 0);
		entrada.close();
	}

}