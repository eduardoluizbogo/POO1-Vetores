package Matriz;

import java.util.Scanner;

public class Exx17_vet {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int select=0;
		
		
		
		String[][] agenda = new String[2][5];
		String comp=" ";
		do {
		
		System.out.println("Selecione uma opção: \n1-Inclusão\n2-Alteração\n3-Consulta\n4-Relatório\n5-Exclusão");
		select = entrada.nextInt();
			
		switch(select) {
		case 1: 
			for (int i = 0; i < agenda.length; i++) {
				System.out.println("Contato "+(i+1)+": ");
				for (int j = 0; j < agenda.length; j++) {
					System.out.print("Nome? ");
					agenda[i][0] = entrada.next();
					System.out.print("Telefone? ");
					agenda[i][1] = entrada.next();
					System.out.print("Celular? ");
					agenda[i][2] = entrada.next();
					System.out.print("E-mail? ");
					agenda[i][3] = entrada.next();
					System.out.print("Data de nascimento? \n");
					agenda[i][4] = entrada.next();
				}
			}
			break;
		case 2: 
			System.out.println("Insira o telefone da pessoa que voce deseja alterar");
			comp = entrada.next();
			for (int i = 0; i < agenda.length; i++) {
				System.out.println("Contato "+(i+1)+": ");
				for (int j = 0; j < agenda.length; j++) {
			if(agenda[i][1].equals(comp)) {
				System.out.print("Nome? ");
				agenda[i][0] = entrada.next();
				System.out.print("Telefone? ");
				agenda[i][1] = entrada.next();
				System.out.print("Celular? ");
				agenda[i][2] = entrada.next();
				System.out.print("E-mail? ");
				agenda[i][3] = entrada.next();
				System.out.print("Data de nascimento? \n");
				agenda[i][4] = entrada.next();
				}else
					System.out.println("Numero invalido!\n");
				}
			}
			break;
		case 3: 
			System.out.println("Insira o nome,sobrenome ou o mês do aniversário");
			comp = entrada.next();
			for (int i = 0; i < agenda.length; i++) {
				for (int j = 0; j < agenda.length; j++) { 
					if(comp == agenda[i][0])
				
				}
			}
			break;
		case 4: 
			break;
		case 5: 
			break;
		}
		}while(select != 0);
	}

}
