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
			
			
			switch (diausr) {
			case 31:
				
				break;

			default:
				break;
			}
		scanner.close();
	}
}
