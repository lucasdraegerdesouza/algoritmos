package Exercicios2.numero2;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
	/*9)Imprima apenas n�meros m�ltiplos de 3, do n�mero digitado pelo usu�rio;*/
		Scanner scanner = new Scanner(System.in);
		int numusuario;
		System.out.println("Digite at� qual numero desejas:");
		numusuario = scanner.nextInt();
		for (int n1 = 0; n1 <= numusuario; n1++){
			if(n1 % 3 == 0) 
			System.out.println(n1);
			scanner.close();
		}
	}
}
