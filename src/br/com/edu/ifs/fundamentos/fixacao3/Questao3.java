package br.com.edu.ifs.fundamentos.fixacao3;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int idade;

		System.out.println("Digite a idade do nadador: ");
		idade = entrada.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.println("Infantil A.");
		}
		if (idade >= 8 && idade <= 11) {
			System.out.println("Infantil B.");
		}
		if (idade >= 12 && idade <= 13) {
			System.out.println("Juvenil A.");
		}
		if (idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B.");
		}
		if (idade > 18) {
			System.out.println("Adultos.");
		}
		entrada.close();
	}

}
