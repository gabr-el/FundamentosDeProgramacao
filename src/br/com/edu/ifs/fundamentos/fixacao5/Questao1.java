package br.com.edu.ifs.fundamentos.fixacao5;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float precoO, precoD, porc;

		System.out.println("Digite o valor original do produto $: " + "0 - Sair");
		precoO = entrada.nextFloat();

		System.out.println("Digite o valor final com desconto $: " + "0 - Sair");
		precoD = entrada.nextFloat();

		while (precoO != 0 && precoD != 0) {

			porc = (precoD / precoO) * 100;

			if (porc <= 80) {
				System.out.printf("%s%.2f%s", "Tudo certo! O desconto foi de ", (100 - porc), "%");
			} else {
				System.out.println("Black Fraude!");
				System.out.println("");
				System.out.println("Digite o valor original do produto $: " + "0 - Sair");
				precoO = entrada.nextFloat();

				System.out.println("Digite o valor final com desconto $: " + "0 - Sair");
				precoD = entrada.nextFloat();
			}

		}
		System.out.println("Programa Finalizado!");

		entrada.close();
	}

}