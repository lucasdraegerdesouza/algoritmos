package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
/*19.Pe�a para o usu�rio digitar um n�mero.
 *Guarde o n�mero que o usu�rio digitou na vari�vel �primeiroNumero�.
 *Crie outra vari�vel de nome �segundoNumero�,
 *atribuindo o valor da vari�vel �primeiroNumero�.
 *Altere o valor da variavel �primeiroNumero� para 10.
 *Imprima a vari�vel �primeiroNumero� e a vari�vel �segundoNumero�.
 *Verifique os valores das vari�veis, como ficaram.*/
		Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um numero:");
			int primeiroNumero;
			primeiroNumero = scanner.nextInt();
			
			int segundoNumero;
			segundoNumero = primeiroNumero;
			primeiroNumero = 10;
			
			System.out.println("Primeiro numero = "+ primeiroNumero + " Segundo numero = "+ segundoNumero);
						
		
		scanner.close();
	}
}
