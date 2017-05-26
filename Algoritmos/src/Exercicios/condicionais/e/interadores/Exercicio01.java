package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*1.Peça para o usuário digitar um número,
 *pegue o número que o usuário digitou.
 *Verifique se o número é maior que 10, caso sim,
 *imprima “o valor digitado é maior que 10”,
 *caso contrário imprima “o valor digitado é menor que 10”.*/		
	System.out.println("Digite um numero");
	int numero;
	numero = scanner.nextInt();
	if (numero >= 10) {
		System.out.println("Numero maior que 10");
	}else {
		System.out.println("Numero menor que 10");
	}
	scanner.close();
	}
}
