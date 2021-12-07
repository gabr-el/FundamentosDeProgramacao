package br.com.edu.ifs.fundamentos.fixacao6;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int idade, idadeNovo = 0, idadeVelho = 0, i, somaIdade = 0, contIdade = 0, somaAltura = 0, contAltura = 0;
		float altura, idadeMedia = 0, alturaMedia = 0;

		for (i = 1; i <= 30; i++) {
			System.out.println("Digite a idade do aluno");
			idade = entrada.nextInt();
			System.out.println("Digite a altura do aluno");
			altura = entrada.nextFloat();

			if (i == 1) {
				idadeNovo = idade;
				idadeVelho = idade;
			} else {
				if (idade < idadeNovo) {
					idadeNovo = idade;
				}
				if (idade > idadeVelho) {
					idadeVelho = idade;
				}
			}
			if (altura < 1.7) {
				somaIdade += idade;
				contIdade++;
			}
			if (idade > 20) {
				somaAltura += altura;
				contAltura++;
			}
		}

		alturaMedia = somaAltura / contAltura;
		idadeMedia = somaIdade / contIdade;
		System.out.println("A idade média dos alunos com menos de 1,70m de altura." + idadeMedia);
		System.out.println("A altura média dos alunos com mais de 20 anos." + alturaMedia);
		System.out.println("A idade do aluno mais novo." + idadeNovo);
		System.out.println("A idade do aluno mais velho." + idadeVelho);
		entrada.close();
	}

}
