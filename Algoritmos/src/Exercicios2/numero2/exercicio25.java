package Exercicios2.numero2;

import java.util.Scanner;

public class exercicio25 {
	public static void main(String[] args) {
//5)Pergunte para o usuário até que número ele quer imprimir, e imprima do 0 até o número desejado pelo usuário;
		Scanner scanner = new Scanner(System.in);
		int numusuario;
		System.out.println("Digite até qual numero desejas:");
		numusuario = scanner.nextInt();
		
		System.out.println(numusuario);
		scanner.close();
		}
	}

