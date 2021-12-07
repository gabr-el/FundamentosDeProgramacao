package br.com.edu.ifs.fundamentos.prova;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int x, y;

		System.out.println("Digite um valor para X :");
		x = entrada.nextInt();
		System.out.println("Digite um valor para X :");
		y = entrada.nextInt();

		if (((12 - 7) > y) && ((13 - x) >= 17)) {
			if ((x * y) > 0) {
				System.out.println("Jogo 1");
			} else {
				System.out.println("Jogo 2");
			}
		} else {
			if ((x * y) > 0) {
				System.out.println("Jogo 3");
			} else {
				System.out.println("Jogo 4");
			}
		}

	}

}
