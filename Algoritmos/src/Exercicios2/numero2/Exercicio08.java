package Exercicios2.numero2;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
/*8)	Imprima apenas n�mero m�ltiplos de 2, de 0 at� o n�mero digitado pelo usu�rio;*/
		Scanner scanner = new Scanner(System.in);
		int numusuario;
		System.out.println("Digite at� qual numero desejas:");
		numusuario = scanner.nextInt();
		for (int n1 = 0; n1 <= numusuario; n1++){
			if(n1 % 2 == 0) 
			System.out.println(n1);
			scanner.close();
			}
		}
}
