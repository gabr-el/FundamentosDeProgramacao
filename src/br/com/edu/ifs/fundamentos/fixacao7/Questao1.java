package br.com.edu.ifs.fundamentos.fixacao7;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int n[] = new int[10];
		int i, cont = 0, x;

		for (i = 0; i < n.length; i++) {
			System.out.println("Digite um valor inteiro: ");
			n[i] = entrada.nextInt();

			System.out.println("Digite o número a ser pesquisado: ");
			x = entrada.hashCode();
			for (int elemento : n) {
				if (elemento == x) {
					cont++;
				}
			}
		}
		System.out.println("Quantidade de vezes que um valor aparece no vetor:" + cont);
		entrada.close();

	}

}