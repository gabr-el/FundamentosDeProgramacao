package br.com.edu.ifs.fundamentos.prova;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int i, opcao;
		int janelas[] = new int[24];
		int corredor[] = new int[24];
		int lugares[] = new int[48];

		System.out.println("1 - vender passagens do ônibus");
		System.out.println("2 - encerrar o programa");
		System.out.println("Digite uma opção: ");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			for (i = 0; i < lugares.length; i++) {
				if (i <= 48) {
					System.out.println("Escolha uma poltrona na janela: ");
					janelas[i] = entrada.nextInt();
					lugares[i] = janelas[i] + i++;
					System.out.println("Escolha uma poltrona no corredor: ");
					corredor[i] = entrada.nextInt();
					lugares[i] = corredor[i] + i++;

				}
			}

			break;
		default:
			System.out.println("Programa encerrado!");
			break;
		}
		for (int elemento : lugares) {
			System.out.println("Quantas poltronas estão ocupadas: " + elemento);

		}
	}

}
