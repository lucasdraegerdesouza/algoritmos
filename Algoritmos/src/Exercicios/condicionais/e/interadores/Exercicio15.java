package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
/*15.Pergunte para o usu�rio um dia do m�s e n�mero do m�s.
 *Fa�a um algoritmo que valide se o dia e o m�s existem
 *no calend�rio, utilizando apenas um Sysout.
 *Sendo considerado duas vari�veis int um para dia e
 *outra para m�s.*/		
		Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o dia");
			int diausr = scanner.nextInt();
			
			System.out.println("Digite o numero do seu mes");
			int numeromes = scanner.nextInt();
			boolean validadata = false;
			switch (numeromes) {
			case 1:
				if (diausr <= 31) {
					validadata = true;
				}				
			break;
			case 2:
				if (diausr <= 28) {
					validadata = true;
				}
			break;
			
			case 3:
				if (diausr <= 31) {
					validadata = true;
				}
			break;
			
			case 4:
				if (diausr <= 30) {
					validadata = true;
				}
			break;
			
			case 5:
				if (diausr <= 31) {
					validadata = true;
				}
			break;
			
			case 6:
				if (diausr <= 30) {
					validadata = true;
				}
			break;
			
			case 7:
				if (diausr <= 31) {
					validadata = true;
				}
			break;
			
			case 8:
				if (diausr <= 31) {
					validadata = true;
				}
			break;
			
			case 9:
				if (diausr <= 30) {
					validadata = true;
				}
			break;
			
			case 10:
				if (diausr <= 31) {
					validadata = true;
				}
			break;
			
			case 11:
				if (diausr <= 30) {
					validadata = true;
				}
			break;
			
			case 12:
				if (diausr <= 31) {
					validadata = true;
				}
			break;
			default: System.out.println("Entre com um numero de mes valido!");
			
			}
			if (validadata == true) {
				System.out.println("A data est� correta");
				}else {
					System.out.println("A data n�o existe");	
				}
			
		scanner.close();
	}
}
