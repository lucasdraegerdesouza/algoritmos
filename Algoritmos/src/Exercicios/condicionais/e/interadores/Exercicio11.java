package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
/*11.Escreve um algoritmo que o usu�rio entre com
 *tr�s n�meros e imprima o maior n�mero entre eles,
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
	              System.out.println("O maior numero �: " + n1usr);
	           else
	              System.out.println("O maior numero �: " + n3usr);
	        else if(n2usr > n3usr)
	              System.out.println("O maior numero �: " + n2usr);
	                else
	              System.out.println("O maior numero �: " + n3usr);
			
		 
		scanner.close();

	}
}