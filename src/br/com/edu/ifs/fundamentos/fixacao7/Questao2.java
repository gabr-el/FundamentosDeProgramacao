package br.com.edu.ifs.fundamentos.fixacao7;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int n[] = new int[5];
		int i, maior = 0, menor = 0, posMaior = 0, posMenor = 0;

		for (i = 0; i < n.length; i++) {
			System.out.println("Digite um valor inteiro: ");
			n[i] = entrada.nextInt();

			if (i == 0) {
				menor = maior=n[i];
				posMaior = posMenor = i;
			} else {	
				if (n[i] > maior) {
					menor = n[i];
					posMenor = i;
				}
				if (n[i] < menor) {
					menor = n[i];
					posMenor = i;
				}
			}

		}
		System.out.println("Maior número: " + maior + "na posição "+(posMaior+1));
		System.out.println("Menor número: " + menor + "na posição "+(posMenor+1));
		entrada.close();
	}
}
