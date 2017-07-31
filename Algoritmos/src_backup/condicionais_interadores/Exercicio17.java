package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio17 {
	// Pergunte o nome da pessoa e a sua idade.
	// Pergunte o nome de outra pessoa e sua idade.
	// Pergunte o nome da terceira pessoa e sua idade
	// Imprima o nome e idade de pessoas mais velha, do meio e a mais nova,
	// e o nome da pessoa mais nova e a idade dela,
	// utilizando apenas um Sysout.
	// Sendo considerado a idade uma variável int.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o nome da Pessoa 1:");
		String pessoa1 = scanner.nextLine();
		System.out.println("Informe a idade da Pessoa 1:");
		int idade1 = Integer.parseInt(scanner.nextLine());

		System.out.println("Informe o nome da Pessoa 2:");
		String pessoa2 = scanner.nextLine();
		System.out.println("Informe a idade da Pessoa 2:");
		int idade2 = Integer.parseInt(scanner.nextLine());

		System.out.println("Informe o nome da Pessoa 3:");
		String pessoa3 = scanner.nextLine();
		System.out.println("Informe a idade da Pessoa 3:");
		int idade3 = Integer.parseInt(scanner.nextLine());

		String[] pessoaMaisVelha = new String[2];
		String[] pessoaDoMeio = new String[2];
		String[] pessoaMaisNova = new String[2];

		if (idade1 > idade2 && idade1 > idade3) {
			pessoaMaisVelha[0] = pessoa1;
			pessoaMaisVelha[1] = String.valueOf(idade1);
			if (idade2 > idade3) {
				pessoaDoMeio[0] = pessoa2;
				pessoaDoMeio[1] = String.valueOf(idade2);
				pessoaMaisNova[0] = pessoa3;
				pessoaMaisNova[1] = String.valueOf(idade3);
			} else if(idade3 > idade2) {
				pessoaDoMeio[0] = pessoa3;
				pessoaDoMeio[1] = String.valueOf(idade3);
				pessoaMaisNova[0] = pessoa2;
				pessoaMaisNova[1] = String.valueOf(idade2);
			}
		} else if (idade2 > idade1 && idade2 > idade3) {
			pessoaMaisVelha[0] = pessoa2;
			pessoaMaisVelha[1] = String.valueOf(idade2);
			if (idade1 > idade3) {
				pessoaDoMeio[0] = pessoa1;
				pessoaDoMeio[1] = String.valueOf(idade1);
				pessoaMaisNova[0] = pessoa3;
				pessoaMaisNova[1] = String.valueOf(idade3);
			} else if (idade3 > idade1) {
				pessoaDoMeio[0] = pessoa3;
				pessoaDoMeio[1] = String.valueOf(idade3);
				pessoaMaisNova[0] = pessoa1;
				pessoaMaisNova[1] = String.valueOf(idade1);
			}
		} else if (idade3 > idade1 && idade3 > idade2) {
			pessoaMaisVelha[0] = pessoa3;
			pessoaMaisVelha[1] = String.valueOf(idade3);
			if (idade1 > idade2) {
				pessoaDoMeio[0] = pessoa1;
				pessoaDoMeio[1] = String.valueOf(idade1);
				pessoaMaisNova[0] = pessoa2;
				pessoaMaisNova[1] = String.valueOf(idade2);
			} else if (idade2 > idade1) {
				pessoaDoMeio[0] = pessoa2;
				pessoaDoMeio[1] = String.valueOf(idade2);
				pessoaMaisNova[0] = pessoa1;
				pessoaMaisNova[1] = String.valueOf(idade1);
			}
		}

		System.out.println("A pessoa " + pessoaMaisVelha[0] + " com " + pessoaMaisVelha[1] + " anos, é a mais velha, "
				+ "a pessoa " + pessoaDoMeio[0] + " com " + pessoaDoMeio[1] + " anos, é a do meio e a pessoa "
				+ pessoaMaisNova[0] + " com " + pessoaMaisNova[1] + " é a mais nova.");

		scanner.close();
	}
}
