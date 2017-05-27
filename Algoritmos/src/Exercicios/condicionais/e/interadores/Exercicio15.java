package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
/*15.Pergunte para o usuário um dia do mês e número do mês.
 *Faça um algoritmo que valide se o dia e o mês existem
 *no calendário, utilizando apenas um Sysout.
 *Sendo considerado duas variáveis int um para dia e
 *outra para mês.*/		
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
