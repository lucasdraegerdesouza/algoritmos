package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
/*5.Pe�a para o usu�rio digitar a idade e ano de nascimento.
 * Pegue os valores que o usu�rio digitou.
 * Verifique se a idade digitada condiz com o ano de nascimento do usu�rio,
 * ou seja, se realmente ele tem a idade que disse ter.
 * Caso sim imprima �Voc� n�o mentiu para mim�, caso contr�rio,
 * imprima �Voc� mentiu para mim, voc� n�o � mais meu amigo�.*/		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		System.out.println("Digite o ano em que voc� nasceu");
		int anonascimento = scanner.nextInt();
		int verificacao = 2017 - anonascimento;
		if (verificacao == idade) {
			System.out.println("Voc� n�o mentiu para mim");
		} else {
			System.out.println("Voc� mentiu para mim");
		}
		scanner.close();
	}
}