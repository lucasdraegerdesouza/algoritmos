package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*18.Pe�a para o usu�rio digitar um n�mero.
 *Guarde o n�mero que o usu�rio digitou.
 *Subtraia o n�mero por 5 e imprima o resultado.
 *Pegue novamente o n�mero que o usu�rio digitou
 *e subtraia por 3 e imprima o resultado.
 *Pegue o resultado da subtra��o por 5
 *e o resultado da subtra��o por 3 e imprima os dois resultado.*/
		int n1;
		int r1;
		int r2;
		System.out.println("Digite um numero:");
		n1 = scanner.nextInt();
		r1 = n1 - 5;
		System.out.println("Subtra��o por 5 = "+ r1);
		r2 = n1 - 3;
		System.out.println("Subtra��o por 3 = "+ r2);
		System.out.println("");
		System.out.println("Subtra��o por 5 = "+ r1 + " e subtra��o por 3 = "+ r2);
		scanner.close();
	}
}
