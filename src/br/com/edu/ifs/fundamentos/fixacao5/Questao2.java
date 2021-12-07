package br.com.edu.ifs.fundamentos.fixacao5;

import java.util.Random;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int ano, anoN = 0, velocidade, velocidadeR = 0, cont = 0;
		char flag;
		//Random rdn = new Random(); //classe que cria um número aleatório

		do {

			System.out.println("Digite o ano do veículo: ");
			ano = entrada.nextInt();
			System.out.println("Digite a velocidade do carro: ");
			velocidade = entrada.nextInt();

			cont++;

			if (ano > anoN) {
				anoN = ano;
			}

			if (velocidade > velocidadeR) {
				velocidadeR = velocidade;
			}

			System.out.println("Deseja continuar com a pesquisa? S/N" );
			flag = entrada.next().charAt(0);
		} while (flag == 's' || flag == 'S');

		System.out.println("Quantidade de carros: " + cont);
		System.out.println("O carro mais novo: " + anoN);
		System.out.println("Carro mais veloz: " + velocidadeR);

		entrada.close();

	}

}
