package br.com.edu.ifs.fundamentos.revisao;

import java.util.Scanner;

public class Questao1 {
	
	//Quest�o 01.Qual a sa�da gerada ap�s a execu��o do programa abaixo?

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int i;

		for (i = 3; i < 20; i += 2) {
			System.out.println((i % 3) + "");
		}
		entrada.close();
	}

}
