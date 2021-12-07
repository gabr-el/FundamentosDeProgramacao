package br.com.edu.ifs.fundamentos.fixacao6;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantidade de jogos vendidos: ");
		n = entrada.nextInt();
		
		float venda = (float)(n*19.9);
		
		System.out.println("Valor total das vendas: "+venda);
		
		float valor = (float)(0.5*venda);
		float bonus = (float)(0.08*venda);
		int calculo = (n/15);
		
		System.out.println("Valor ganho como bônus: "+(calculo*bonus));
		float salario = valor+(calculo*bonus);
		System.out.println("Valor a receber: R$"+salario);
		
	}

}
