package br.com.edu.ifs.fundamentos.fixacao6;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int i, n;
		double termo, soma = 0;

		System.out.println("Digite o ultimo valor do termo da série: ");
		n = entrada.nextInt();

		for (i = 1; i <= n; i++) {
			termo = 1 / (double) (i * (i + 2));
			soma += termo;
		}

		System.out.println("Soma até o termo n:" + soma);
	}

}
