package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
/*4.Pe�a para o usu�rio digitar dois n�meros,
 * pegue os dois n�meros que o usu�rio digitou.
 * Se o primeiro n�mero que o usu�rio digitar
 * e o segundo n�mero que o usu�rio digitou forem m�ltiplos de 7,
 * imprima �os dois n�meros s�o m�ltiplos de 7�,
 * caso contr�rio imprima, �os dois n�meros n�o s�o m�ltiplos de 7�.*/		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero1 = scanner.nextInt();
		System.out.println("Digite outro numero");
		int numero2 = scanner.nextInt();
		if (numero1 % 7 == 0 & numero2 % 7 == 0) {
			System.out.println("os dois n�meros s�o m�ltiplos de 7");
		} else {
			System.out.println("os dois n�meros n�o s�o m�ltiplos de 7");
		}
		
		scanner.close();
	}
}