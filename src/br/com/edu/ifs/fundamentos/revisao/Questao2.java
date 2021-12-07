package br.com.edu.ifs.fundamentos.revisao;

import java.util.Scanner;

public class Questao2 {

	/*
	 * Questão 02. Calcular a multa: Leia a velocidade de um carro e a velocidade
	 * máxima para a rua: 1. Informe 50 reais se estiver até 10km/h acima; 2.
	 * Informe 100 reais se estiver entre 11km/h e 30km/h acima; 3. Informe 300
	 * reais se estiver acima de 31km/h acima;
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float velocidade, velocidadeMaxima, diferenca;

		System.out.println("Qual a velocidade do carro? ");
		velocidade = entrada.nextFloat();
		System.out.println("Qual o limite de velocidade da rua?");
		velocidadeMaxima = entrada.nextFloat();

		if (velocidade > velocidadeMaxima) {
			diferenca = velocidade - velocidadeMaxima;
			if (diferenca <= 10) {
				System.out.println("Multa de $50 reais.");
			} else {
				if (diferenca >= 11 && diferenca <= 30) {
					System.out.println("Multa de $100 reais.");
				} else {
					System.out.println("Multa de $300 reais. ");
				}
			}

		} else {
			System.out.println("Velocidade dentro do limite.");
		}
		entrada.close();
	}

}
