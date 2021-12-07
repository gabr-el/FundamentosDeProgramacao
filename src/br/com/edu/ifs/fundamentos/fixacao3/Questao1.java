package br.com.edu.ifs.fundamentos.fixacao3;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float p, multa, excesso;

		System.out.println("Quantidade em quilos de peixe: ");
		p = entrada.nextFloat();

		if (p > 50) {
			excesso = p - 50;
			multa = excesso * 8;
			System.out.println("Quantidade excedida " + excesso + "Kg");
			System.out.println("Valor da multa $" + multa);

		}
		entrada.close();
	}

}
