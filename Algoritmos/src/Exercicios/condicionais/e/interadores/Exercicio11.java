package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
/*11.Escreve um algoritmo que o usuário entre com
 *três números e imprima o maior número entre eles,
 *utilizando apenas um System.out.println.*/		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero double");
		int n1usr = scanner.nextInt();
		
		System.out.println("Digite outro numero double");
		int n2usr = scanner.nextInt();
		
		System.out.println("Digite outro numero double");
		int n3usr = scanner.nextInt();
		
		 if(n1usr > n2usr)
	           if(n1usr > n3usr)
	              System.out.println("O maior numero é: " + n1usr);
	           else
	              System.out.println("O maior numero é: " + n3usr);
	        else if(n2usr > n3usr)
	              System.out.println("O maior numero é: " + n2usr);
	                else
	              System.out.println("O maior numero é: " + n3usr);
			
		 
		scanner.close();

	}
}