package br.com.edu.ifs.fundamentos.fixacao6;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int n, i;
		double termo, soma = 0;

		System.out.println("Digite o número do ultimo termo da série: ");
		n = entrada.nextInt();
		System.out.println("Digite um valor para X: ");
		int x = entrada.nextInt();

		for (i = 1; i <= n * 2; i = i + 2) {
			termo = (float) ((Math.pow(x, 1)) / i);
			soma += termo;
		}
		System.out.println("Soma até o termo N " + soma);
		entrada.close();
	}

}
