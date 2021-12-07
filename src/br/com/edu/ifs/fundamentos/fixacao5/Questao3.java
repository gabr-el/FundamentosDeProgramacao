package br.com.edu.ifs.fundamentos.fixacao5;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String matricula;
		float cre, creMe = 0, creMed = 0, creTol = 0;
		int cont = 0;

		System.out.println("Digite a matricula do aluno: ");
		matricula = entrada.next();
		
		if (matricula.equals("999")) {
			System.out.println("Programa finalizado.");
		} else {
			while (matricula.equals("999") == false) {
				System.out.println("Coeficiente de rendimento: ");
				cre = entrada.nextFloat();
				cont++;
				if (cont == 1) {
					creMe = cre;
				} else {
					if (cre < creMe) {
						creMe = cre;

					}
					creTol += cre;
					System.out.println("Digite a matrícula: ");
					matricula = entrada.next();
				}
				creMed = creTol / cont;
				System.out.println("Menor CRE: " + creMe);
				System.out.println("Média CRE: " + creMed);

			}
		}
	}
}
