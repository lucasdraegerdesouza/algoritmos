package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
/*11.Escreve um algoritmo que o usuário entre com
 *três números e imprima o maior número entre eles,
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