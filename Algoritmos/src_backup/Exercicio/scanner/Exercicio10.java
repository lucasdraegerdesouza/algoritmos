package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
/*10.Escreva no console para digitar um número inteiro,
 * leia o número inteiro digitado.
 * Escreva no console para digitar outro número inteiro,
 * leia o número inteiro digitado.
 * Imprima no console o valor do resultado do primeiro número
 * elevado ao quadrado mais o segundo número elevado ao quadrado.*/		
					Scanner scanner = new Scanner(System.in);
					int numero1;
					int numero2;
					System.out.println("Digite um numero:");
					numero1 = scanner.nextInt();
					
					System.out.println("Digite outro numero:");
					numero2 = scanner.nextInt();
															
					int resultado;
					resultado = (int) (Math.pow(numero1, 2) + Math.pow(numero2, 2));
					System.out.println(resultado);
					scanner.close();
	
					}
	
}
