package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*1.Pe�a para o usu�rio digitar um n�mero,
 *pegue o n�mero que o usu�rio digitou.
 *Verifique se o n�mero � maior que 10, caso sim,
 *imprima �o valor digitado � maior que 10�,
 *caso contr�rio imprima �o valor digitado � menor que 10�.*/		
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
