package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
/*17.Pe�a para o usu�rio digitar um n�mero.
 *Guarde o n�mero que o usu�rio digitou.
 *Some o n�mero que o usu�rio digitou com 5.
 *Imprima o resultado da soma.
 *Pegue o resultado e some com 5 novamente.
 *Imprima o resultado da soma.*/
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero");
		numero = scanner.nextInt();
		
		numero = numero + 5;
		System.out.println(numero);
		
		numero = numero + 5;
		System.out.println(numero);
		
		scanner.close();
	}
}