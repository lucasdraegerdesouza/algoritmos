package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*3.Pe�a para o usu�rio digitar dois n�meros,
 *pegue os dois n�meros que o usu�rio digitou.
 *Multiplique os dois n�meros.
 *Se o resultado da multiplica��o for m�ltiplo de 5 imprima
 *�o resultado � m�ltiplo de 5�,
 *caso contr�rio, imprima �o resultado n�o foi o esperado�.
 *Ap�s o teste da da condi��o do if, imprima o resultado da multiplica��o.*/
		System.out.println("Digite um numero");
		int numero1 = scanner.nextInt();
		System.out.println("Digite outro numero");
		int numero2 = scanner.nextInt();
		int multiplicacao;
		multiplicacao = numero1 * numero2;
		if (multiplicacao % 5 == 0) {
			System.out.println("o resultado � m�ltiplo de 5");
		} else {
			System.out.println("o resultado n�o foi o esperado");
		}
		System.out.println("Resultado da multiplica��o = "+ multiplicacao);
		scanner.close();
	}
}