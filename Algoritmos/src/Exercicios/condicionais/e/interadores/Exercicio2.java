package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
/*2.Pe�a para o usu�rio digitar um n�mero,
 *pegue o n�mero que o usu�rio digitou.
 *Verifique se o n�mero � �mpar, caso sim,
 *imprima �o valor digitado � �mpar�,
 *caso contr�rio imprima �o valor � par�.*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero;
		numero = scanner.nextInt();
		if (numero % 2 == 1) {
			System.out.println("o valor digitado � �mpar");
		}else {
			System.out.println("o valor digitado n�o � impar");
		}
		scanner.close();
	}
}