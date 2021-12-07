package br.com.edu.ifs.fundamentos.fixacao4;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String cor;
		int tipo;
		float valor;

		System.out.println("Digite a cor da camisa: ");
		cor = entrada.next();
		System.out.println("Digite o tipo: 1 - Bordado\n 2 - Serigrafado\n ");
		tipo = entrada.nextInt();
		System.out.println("Digite o valor da camisa: ");
		valor = entrada.nextFloat();
		if (valor <= 45) {

			if (cor.equalsIgnoreCase("preta") || cor.equalsIgnoreCase("marrom") || cor.equalsIgnoreCase("azul")
					|| cor.equalsIgnoreCase("verde")) {
				if (tipo == 1 && valor <= 35)
					System.out.println("Cotação aceita.");
				else
					System.out.println("Cotação não aceita.");
			}

			else {
				if (cor.equalsIgnoreCase("branca") || cor.equalsIgnoreCase("amarela") || cor.equalsIgnoreCase("rosa")) {
					if (valor <= 35)
						System.out.println("Cotação aceita.");
					else
						System.out.println("Cotação não aceita.");

				} else
					System.out.println("Em análise.");

			}
		}

		else {
			System.out.println("Cotação não aceita.");

		}

	}
}
