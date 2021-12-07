package br.com.edu.ifs.fundamentos.fixacao2;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int n, c, m, d, u, aux;

		System.out.println("Digite um número com 3 algorismos: ");
		n = entrada.nextInt();

		c = Math.floorDiv(n, 100);
		aux = Math.floorMod(n, 100);
		d = Math.floorDiv(aux,10);
		u = Math.floorMod(aux, 10);
		
		m = u * 100 + d * 10 + c;
		
		System.out.println(m);
		
		entrada.close();

	}

}
