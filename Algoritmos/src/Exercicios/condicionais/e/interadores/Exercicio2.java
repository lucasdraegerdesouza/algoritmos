package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
/*2.Peça para o usuário digitar um número,
 *pegue o número que o usuário digitou.
 *Verifique se o número é ímpar, caso sim,
 *imprima “o valor digitado é ímpar”,
 *caso contrário imprima “o valor é par”.*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero;
		numero = scanner.nextInt();
		if (numero % 2 == 1) {
			System.out.println("o valor digitado é ímpar");
		}else {
			System.out.println("o valor digitado não é impar");
		}
		scanner.close();
	}
}