package Exercicios2.numero2;

import java.util.Scanner;

public class exercicio25 {
	public static void main(String[] args) {
//5)Pergunte para o usu�rio at� que n�mero ele quer imprimir, e imprima do 0 at� o n�mero desejado pelo usu�rio;
		Scanner scanner = new Scanner(System.in);
		int numusuario;
		System.out.println("Digite at� qual numero desejas:");
		numusuario = scanner.nextInt();
		
		System.out.println(numusuario);
		scanner.close();
		}
	}

