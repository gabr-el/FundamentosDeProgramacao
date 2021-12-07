package br.com.edu.ifs.fundamentos.fixacao1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double diaria = 30.0, km = 0.01, percentual = 10.0/100.0, total, total1, total2;
		int dias, km_rodado;
		
		System.out.println("Quantos dias ficou com o carro?");
		dias = entrada.nextInt();
		System.out.println("Quantos quilômetros foi rodado?");
		km_rodado = entrada.nextInt();
		
		total1 = dias * diaria;
		total2 = km_rodado * km;
		total = total1 + total2;
		total = total - (percentual * total);
		
		System.out.println("O cliente deve pagar $"+total);
		
		entrada.close();

	}

}
