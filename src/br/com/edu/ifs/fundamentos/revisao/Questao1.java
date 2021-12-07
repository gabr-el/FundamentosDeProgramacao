package br.com.edu.ifs.fundamentos.revisao;

import java.util.Scanner;

public class Questao1 {
	
	//Questão 01.Qual a saída gerada após a execução do programa abaixo?

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int i;

		for (i = 3; i < 20; i += 2) {
			System.out.println((i % 3) + "");
		}
		entrada.close();
	}

}
