package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
/*16.Pergunte o nome da pessoa e a sua idade.
 *Pergunte o nome de outra pessoa e sua idade.
 *Imprima o nome da pessoa mais velha e a idade dela,
 *e o nome da pessoa mais nova e a idade dela,
 *utilizando apenas um Sysout.
 *Sendo considerado a idade uma variável int.*/		
		Scanner scanner = new Scanner(System.in);
			System.out.println("Digite seu nome: ");
			String nomeusr1 = scanner.next();
			
			System.out.println("Digite sua idade: ");
			int idadeusr1 = scanner.nextInt();
			
			System.out.println("Digite seu nome: ");
			String nomeusr2 = scanner.next();
			
			System.out.println("Digite sua idade: ");
			int idadeusr2 = scanner.nextInt();
			
			if (idadeusr1 > idadeusr2) {
				System.out.println(nomeusr1 + "tem "+ idadeusr1 + " anos");
				System.out.println(nomeusr2 + "tem "+ idadeusr2 + " anos");
			}else {
				System.out.println(nomeusr2 + "tem "+ idadeusr2 + " anos");
				System.out.println(nomeusr1 + "tem "+ idadeusr1 + " anos");
			}
			
		scanner.close();
	}
}
