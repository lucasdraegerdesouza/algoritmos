package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
/*11.Escreve um algoritmo que o usu�rio entre com
 *tr�s n�meros e imprima o maior n�mero entre eles,
 *utilizando apenas um System.out.println.*/		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero double");
		double n1usr = scanner.nextDouble();
		
		System.out.println("Digite outro numero double");
		double n2usr = scanner.nextDouble();
		
		System.out.println("Digite outro numero double");
		double n3usr = scanner.nextDouble();
			
		scanner.close();

	}
}