package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
/*15.Vamos considerar que temos que validar um campo texto 
 * e uma tela de cadastro de pessoa, no qual � um campo de observa��o.
 *Caso a quantidade de caracteres que o usu�rio digitou for maior que 50,
 *imprima false, caso contr�rio imprima true.*/		
		Scanner scanner = new Scanner(System.in);
		String observacao;
		System.out.println("Digite a observa��o");
		observacao = scanner.nextLine();
		
		if (observacao.length() > 50) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		scanner.close();
	}
}
