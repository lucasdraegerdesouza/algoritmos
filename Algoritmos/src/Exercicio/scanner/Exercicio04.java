package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio04 {
/*Escreva no console para digitar um n�mero inteiro, 
 *leia o n�mero inteiro digitado.
 *Escreva no console para digitar outro n�mero inteiro,
 *leia o n�mero inteiro digitado.
 *Imprima no console true se o primeiro n�mero � maior que o segundo n�mero digitado.*/

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
