package Exercicios.condicionais.e.interadores;


import java.util.Arrays;
import java.util.Scanner;



public class Exercicio17 {
	public static void main(String[] args) {
/*17.Pergunte o nome da pessoa e a sua idade.
 *Pergunte o nome de outra pessoa e sua idade.
 *Pergunte o nome da terceira pessoa e sua idade.
 *Imprima o nome e idade de pessoas mais velha,
 *do meio e a mais nova,
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
			
			System.out.println("Digite seu nome: ");
			String nomeusr3 = scanner.next();
		
			System.out.println("Digite sua idade: ");
			int idadeusr3 = scanner.nextInt();
				
			int[] idadeusrs = new int[3]; 
						
			idadeusrs[0] = idadeusr1; 
			idadeusrs[1] = idadeusr2;
			idadeusrs[2] = idadeusr3;
			Arrays.sort(idadeusrs);
			
			String[] name = new String[3];
			
			name[0] = nomeusr1; 
			name[1] = nomeusr2;
			name[2] = nomeusr3;
			
			
			String result[] = new String[3];
			
			result[2] = Integer.toString(idadeusrs[2]) + name[2];
			result[1] = Integer.toString(idadeusrs[1]) + name[1];
			result[0] = Integer.toString(idadeusrs[0]) + name[0];
			
			System.out.println(result[2]+ " / " + result[1] + " / " + result[0]);
			
		scanner.close();
	}
}
