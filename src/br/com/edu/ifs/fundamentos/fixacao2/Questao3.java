package br.com.edu.ifs.fundamentos.fixacao2;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float escada, altura;
		double distancia;

		System.out.println("Digite o tamanho da escada em metros: ");
		escada = entrada.nextFloat();
		System.out.println("Digite a altura em que se deseja inserir o prego em metros: ");
		altura = entrada.nextFloat();

		distancia = Math.sqrt((Math.pow(escada, 2) - Math.pow(altura, 2)));

		System.out.printf("%s%.2%s", "distância da escada à parede: ", distancia, "m.");

		entrada.close();
	}

}
