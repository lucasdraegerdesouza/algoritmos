package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio05 {
/*Escreva no console para digitar um n�mero inteiro, 
 *leia o n�mero inteiro digitado. 
 *Escreva no console para digitar outro n�mero inteiro,
 *leia o n�mero inteiro digitado.
 *Imprima no console true se o resultado do primeiro n�mero
 *menos o segundo n�mero � maior que 0 e false caso for menor igual a 0.*/
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		System.out.println("Digite um numero:");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite outro numero:");
		numero2 = scanner.nextInt();
		int resultado;
		resultado = numero1 - numero2;
		
		if (resultado >= 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		scanner.close();
	
	}
}
