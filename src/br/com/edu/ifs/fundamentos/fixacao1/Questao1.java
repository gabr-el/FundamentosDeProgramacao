package br.com.edu.ifs.fundamentos.fixacao1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		double valor, novoValor;
		final double percentual = 9.0 /100.0;
		
		System.out.println("Digite o valor atual do produto $");
		valor = entrada.nextDouble();
		novoValor = valor - (percentual*valor);
		System.out.println("Valor atualizado $" + novoValor);
		
		entrada.close();
	}
}