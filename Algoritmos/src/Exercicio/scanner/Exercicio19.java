package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
/*19.Peça para o usuário digitar um número.
 *Guarde o número que o usuário digitou na variável “primeiroNumero”.
 *Crie outra variável de nome “segundoNumero”,
 *atribuindo o valor da variável “primeiroNumero”.
 *Altere o valor da variavel “primeiroNumero” para 10.
 *Imprima a variável “primeiroNumero” e a variável “segundoNumero”.
 *Verifique os valores das variáveis, como ficaram.*/
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
