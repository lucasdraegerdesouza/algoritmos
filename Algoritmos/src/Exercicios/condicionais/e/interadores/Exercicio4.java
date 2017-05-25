package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
/*4.Peça para o usuário digitar dois números,
 * pegue os dois números que o usuário digitou.
 * Se o primeiro número que o usuário digitar
 * e o segundo número que o usuário digitou forem múltiplos de 7,
 * imprima “os dois números são múltiplos de 7”,
 * caso contrário imprima, “os dois números não são múltiplos de 7”.*/		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero1 = scanner.nextInt();
		System.out.println("Digite outro numero");
		int numero2 = scanner.nextInt();
		if (numero1 % 7 == 0 & numero2 % 7 == 0) {
			System.out.println("os dois números são múltiplos de 7");
		} else {
			System.out.println("os dois números não são múltiplos de 7");
		}
		
		scanner.close();
	}
}