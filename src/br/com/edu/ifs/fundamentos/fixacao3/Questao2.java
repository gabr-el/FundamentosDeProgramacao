package br.com.edu.ifs.fundamentos.fixacao3;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float indice;

		System.out.println("Digite o �ndice de polui��o: ");
		indice = entrada.nextFloat();

		if (indice > 0.05 && indice < 0.25) {
			System.out.println("Indice aceitavel.");
		}

		if (indice > 0.25 && indice < 0.45) {
			System.out.println("1� Grupo de empresas intimadas a suspenderem suas atividades.");
		}

		if (indice >= 0.45) {
			System.out.println("1� e 2� grupo s�o intimadas a suspenderem suas atividades.");
		}
		entrada.close();
	}
}
