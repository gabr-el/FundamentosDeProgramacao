package br.com.edu.ifs.fundamentos.fixacao1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		double km, velocidade, velocidadeMetros, tempo;

		System.out.println("Digite a distância em KM: ");
		km = entrada.nextDouble();
		System.out.println("Digite a velocidade em KM: ");
		velocidade = entrada.nextDouble();

		tempo = km / velocidade;
		System.out.println("Tempo gasto: " + tempo + "h.");
		velocidadeMetros = velocidade / 3.6;
		System.out.println("Velocidade em m/s: " + velocidadeMetros);

		entrada.close();

	}

}
