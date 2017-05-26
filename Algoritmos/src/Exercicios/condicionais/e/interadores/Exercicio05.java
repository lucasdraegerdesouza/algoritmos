package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
/*5.Peça para o usuário digitar a idade e ano de nascimento.
 * Pegue os valores que o usuário digitou.
 * Verifique se a idade digitada condiz com o ano de nascimento do usuário,
 * ou seja, se realmente ele tem a idade que disse ter.
 * Caso sim imprima “Você não mentiu para mim”, caso contrário,
 * imprima “Você mentiu para mim, você não é mais meu amigo”.*/		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		System.out.println("Digite o ano em que você nasceu");
		int anonascimento = scanner.nextInt();
		int verificacao = 2017 - anonascimento;
		if (verificacao == idade) {
			System.out.println("Você não mentiu para mim");
		} else {
			System.out.println("Você mentiu para mim");
		}
		scanner.close();
	}
}