package br.com.edu.ifs.fundamentos.prova;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escolha uma op��o: ");
		int opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Primeira op��o");
			break;
		case 2:
			System.out.println("Segunda op��o");
			break;
		case 3:
			System.out.println("Terceira op��o");
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;

		}
	}

}
