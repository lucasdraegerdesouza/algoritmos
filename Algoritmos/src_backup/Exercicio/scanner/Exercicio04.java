package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio04 {
/*Escreva no console para digitar um número inteiro, 
 *leia o número inteiro digitado.
 *Escreva no console para digitar outro número inteiro,
 *leia o número inteiro digitado.
 *Imprima no console true se o primeiro número é maior que o segundo número digitado.*/

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		System.out.println("Digite um numero:");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite outro numero:");
		numero2 = scanner.nextInt();
		
		if (numero1 > numero2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		scanner.close();
	
	}
	

}
