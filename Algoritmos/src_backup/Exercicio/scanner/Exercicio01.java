package Exercicio.scanner;

import java.util.Scanner;	

public class Exercicio01 {
/*1.Escreva no console para digitar um número inteiro,
 *  leia o número inteiro digitado e imprima o número no console.*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ninteiro;
		System.out.println("Digite um numero inteiro:");
		ninteiro = scanner.nextInt();
		System.out.println(ninteiro);
		scanner.close();
		
	}
	
}
