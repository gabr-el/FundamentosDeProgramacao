package br.com.edu.ifs.fundamentos.fixacao4;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int escolha, horas1, minutos1, segundos1, horas2, minutos2, segundos2, total;

		System.out.println("Digite o início da ocorrência em horas, minutos e segundos: ");
		horas1 = entrada.nextInt();
		minutos1 = entrada.nextInt();
		segundos1 = entrada.nextInt();
		System.out.println("Digite o fim da ocorrência em horas, minutos e segundos: ");
		horas2 = entrada.nextInt();
		minutos2 = entrada.nextInt();
		segundos2 = entrada.nextInt();

		System.out.println("1 - Horas");
		System.out.println("2 - Minutos");
		System.out.println("3 - Segundos");
		System.out.println("");
		System.out.println("Em que tempo deseja receber o resultado da ocorrência?");
		escolha = entrada.nextInt();

		switch (escolha) {
		case 1:
			total = (horas2 - horas1);
			System.out.println(total);
			break;
		case 2:
			total = (horas2 - horas1) * 60 ;
			System.out.println(total);
			break;
		case 3:
			total = ((horas2 - horas1) + (minutos2 - minutos1)) * 3600;
			System.out.println(total);
			break;

		default:

		}

	}

}
