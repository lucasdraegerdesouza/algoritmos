package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio08 {

public static void main(String[] args) {
/*8.Escreva no console para digitar um n�mero inteiro,
 * leia o n�mero inteiro digitado.
 * Escreva no console para digitar outro n�mero inteiro,
 * leia o n�mero inteiro digitado.
 * Imprima no console true se o primeiro n�mero digitado
 * � maior que 5 e o segundo n�mero menor que 10.
 * Caso contr�rio imprima false.*/		
		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		System.out.println("Digite um numero:");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite outro numero:");
		numero2 = scanner.nextInt();
				
		if (numero1 >= 5 && numero2 <= 10) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}		
		scanner.close();
	
	}
	
}
