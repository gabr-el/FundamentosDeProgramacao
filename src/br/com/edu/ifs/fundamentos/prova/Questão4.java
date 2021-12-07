package br.com.edu.ifs.fundamentos.prova;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String jogador1, jogador2;

		System.out.println("Primeiro jogador: Pedra, papel ou tesoura? ");
		jogador1 = entrada.next();
		System.out.println("Segundo jogador: Pedra, papel ou tesoura? ");
		jogador2 = entrada.next();

		if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) {
			System.out.println("Jogador 1 perdeu!");
			System.out.println("Jogador 2 venceu!");
		} else {
			if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("tesoura")) {
				System.out.println("Jogador 1 venceu!");
				System.out.println("Jogador 2 perdeu!");
			} else {
				if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")) {
					System.out.println("Empate!");
				} else {
					if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("tesoura")) {
						System.out.println("Jogador 2 perdeu!");
						System.out.println("Jogador 1 venceu!");
					} else {
						if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra")) {
							System.out.println("Jogador 1 venceu!");
							System.out.println("Jogador 2 perdeu!");
						} else {
							if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) {
								System.out.println("Empate!");
							} else {
								if (jogador1.equalsIgnoreCase("tesoura") && jogador2.equalsIgnoreCase("papel")) {
									System.out.println("Jogador 1 venceu!");
									System.out.println("Jogador 2 perdeu!");
								} else {
									if (jogador1.equalsIgnoreCase("tesoura") && jogador2.equalsIgnoreCase("pedra")) {
										System.out.println("Jogador 2 venceu!");
										System.out.println("Jogador 1 perdeu!");
									} else {
										if (jogador1.equalsIgnoreCase("tesoura")
												&& jogador1.equalsIgnoreCase("tesoura")) {
											System.out.println("Empate!");
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

}
