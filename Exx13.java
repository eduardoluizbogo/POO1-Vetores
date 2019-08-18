package Vetor;

import java.util.Scanner;

public class Exx13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 
		
		int cont=0;
		float mediaaltura=0;
		float mediaidade=0;
		float alturamaisvelho =0;
		float idademaisvelho =0;
		float alturamaisnovo =0;
		float idademaisnovo =0;
		float alturamaisbaixo =0;
		float idademaisbaixo =0;
		float alturamaisalto =0;
		float idademaisalto =0;
		final int TAM=2;
		float[] idade = new float[TAM];
		float[] altura = new float[TAM];
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Insira a idade da pessoa "+i);
			idade[i] = entrada.nextFloat();
			System.out.println("Insira a altura da pessoa "+i);
			altura[i] = entrada.nextFloat();
	
			cont++;
			mediaaltura += altura[i];
			mediaidade += idade[i];
			
			if(i==0) {
				alturamaisvelho = altura[i];
				idademaisvelho = idade[i];
				alturamaisnovo = altura[i];
				idademaisnovo = idade[i];
				alturamaisbaixo = altura[i];
				idademaisbaixo = idade[i];
				alturamaisalto = altura[i];
				idademaisalto = idade[i];
			}
			if(idade[i] > idademaisvelho) {
				idademaisvelho = idade[i];
				alturamaisvelho = altura[i];
			}
			if(idade[i] < idademaisnovo) {
				idademaisnovo = idade[i];
				alturamaisnovo = altura[i];
			}
			if(altura[i] < alturamaisbaixo) {
				idademaisbaixo = idade[i];
				alturamaisbaixo = altura[i];
			}
			if(altura[i] > alturamaisalto) {
				idademaisalto = idade[i];
				alturamaisalto = altura[i];
			}
		}
		for (int i = 0; i < TAM; i++) {
			System.out.println("Altura da pessoa "+i+" e: "+altura[i]);	
			System.out.println("Idade da pessoa "+i+" e: "+idade[i]);
		}
		
		System.out.println("A altura do mais velho e: "+alturamaisvelho);
		System.out.println("A idade do mais velho e: "+idademaisvelho);
		System.out.println("A altura do mais novo e: "+alturamaisnovo);
		System.out.println("A idade do mais novo e: "+idademaisnovo);
		System.out.println("A altura do mais baixo e: "+alturamaisbaixo);
		System.out.println("A idade do mais baixo e: "+idademaisbaixo);
		System.out.println("A altura do mais alto e: "+alturamaisalto);
		System.out.println("A idade do mais alto e: "+idademaisalto);
		
		mediaidade = mediaidade / cont;
		mediaaltura = mediaaltura / cont;
		
		System.out.println("\nIdade e altura de quem esta abaixo e acima da media: ");
		for (int i = 0; i < TAM; i++) {
			if(idade[i] < mediaidade) {
				System.out.println(idade[i]);
				System.out.println(altura[i]);
			}
			if(idade[i] > mediaidade) {
				System.out.println(idade[i]);
				System.out.println(altura[i]);
			}
			if(altura[i] < mediaaltura) {
				System.out.println(idade[i]);
				System.out.println(altura[i]);
			}
			if(altura[i] < mediaaltura) {
				System.out.println(idade[i]);
				System.out.println(altura[i]);
			}
		}
		entrada.close();
	}
}
