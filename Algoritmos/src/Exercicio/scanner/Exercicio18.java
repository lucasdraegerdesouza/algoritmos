package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*18.Peça para o usuário digitar um número.
 *Guarde o número que o usuário digitou.
 *Subtraia o número por 5 e imprima o resultado.
 *Pegue novamente o número que o usuário digitou
 *e subtraia por 3 e imprima o resultado.
 *Pegue o resultado da subtração por 5
 *e o resultado da subtração por 3 e imprima os dois resultado.*/
		int n1;
		int r1;
		int r2;
		System.out.println("Digite um numero:");
		n1 = scanner.nextInt();
		r1 = n1 - 5;
		System.out.println("Subtração por 5 = "+ r1);
		r2 = n1 - 3;
		System.out.println("Subtração por 3 = "+ r2);
		System.out.println("");
		System.out.println("Subtração por 5 = "+ r1 + " e subtração por 3 = "+ r2);
		scanner.close();
	}
}
