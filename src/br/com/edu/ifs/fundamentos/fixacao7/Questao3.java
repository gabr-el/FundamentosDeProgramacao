package br.com.edu.ifs.fundamentos.fixacao7;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int i;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[20];
		int j = 0, m = 0;

		for (i = 0; i < a.length; i++) {
			System.out.println("Digite um valor inteiro: ");
			a[i] = entrada.nextInt();
		}
		for (i = 0; i < b.length; i++) {
			System.out.println("Digite um valor inteiro: ");
			b[i] = entrada.nextInt();
		}

		for (i = 0; i < c.length; i++) {
			if (i % 2 == 0) {
				c[i] = a[j];
				j++;
			} else {
				c[i] = b[j];
				m++;
			}

		}
		for (int elemento : c) {
			System.out.println("Para cada elemento inteiro de n: " + elemento);

		}

	}

}
