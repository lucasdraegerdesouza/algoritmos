package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio06 {
/*6.Escreva no console para digitar um número inteiro,
 *leia o número inteiro digitado.
 *Escreva no console para digitar outro número inteiro,
 *leia o número inteiro digitado.
 *Imprima no console o resultado da divisão dos dois números.*/

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double numero1;
		double numero2;
		System.out.println("Digite um numero:");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite outro numero:");
		numero2 = scanner.nextInt();
		double resultado;
		resultado = numero1 / numero2;
		
		System.out.println(resultado);
		
		scanner.close();
	
	}



}
