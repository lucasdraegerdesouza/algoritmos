package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
/*11.Escreva no console para digitar um número inteiro,
 *leia o número inteiro digitado.
 *Escreva no console para digitar outro número inteiro,
 *leia o número inteiro digitado.
 *Imprima no console o resto do primeiro número digitado
 *com o segundo número digitado, o multiplicando por 10.*/		
							Scanner scanner = new Scanner(System.in);
							int numero1;
							int numero2;
							System.out.println("Digite um numero:");
							numero1 = scanner.nextInt();
							
							System.out.println("Digite outro numero:");
							numero2 = scanner.nextInt();
							int resultado;										
							resultado = (numero1 % numero2) * 10;
							System.out.println(resultado);
							
							scanner.close();
			
							}
}
