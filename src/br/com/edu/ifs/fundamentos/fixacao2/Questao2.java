package br.com.edu.ifs.fundamentos.fixacao2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Float largura, comprimento, area;
		int iluminacao;
		final int potencia = 18;

		System.out.println("Digite a comprimento em CM: ");
		comprimento = entrada.nextFloat();
		System.out.println("Digite a largura em CM: ");
		largura = entrada.nextFloat();

		area = (comprimento/100*largura/100);

		iluminacao = Math.round(area)*potencia;

		System.out.println("A área é de "+area+"m².");
		System.out.println("Deverá ser utilizada " + iluminacao + " W de potência.");

		entrada.close();

	}

}
