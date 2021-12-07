package br.com.edu.ifs.fundamentos.revisao;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int t, i, quantidade, total = 0;
		String alimento;

		System.out.println("Quanto alimentos da tabela você consome? (0-7, sendo 0 para sair)");
		t = entrada.nextInt();
		if (t >= 1 && t <= 7) {
			for (i = 1; i <= t; i++) {
				System.out.println("Digite o alimento (sem acentuação) e  sua quantidade: ");
				alimento = entrada.next();
				quantidade = entrada.nextInt();
				switch (alimento) {
				case "suco":
					total = total + (quantidade * 120);
					break;
				case "morango":
					total = total + (quantidade * 85);
					break;
				case "mamao":
					total = total + (quantidade * 85);
					break;
				case "goiaba":
					total = total + (quantidade * 70);
					break;
				case "manga":
					total = total + (quantidade * 56);
					break;
				case "laranja":
					total = total + (quantidade * 50);
					break;
				case "brocolis":
					total = total + (quantidade * 34);
					break;
				}

			}
			if (total < 100) {
				System.out.println("Precisa comer + " + (110 - total) + "mg");
			} else {
				if (total >= 100 && total <= 130) {
					System.out.println(total + " mg");
				} else {
					System.out.println("Precisa comer - " + (total - 130) + "mg");
				}
			}

		} else {
			if (t == 0) {
				System.out.println("Finalizando Programa. ");
			} else {
				System.out.println("Número inválido. ");
			}

		}
		entrada.close();
	}

}
