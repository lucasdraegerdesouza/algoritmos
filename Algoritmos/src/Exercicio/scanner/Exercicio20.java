package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio20 {
/*20.Peça para o usuário digitar um texto.
 *Guarde o texto que o usuário digitou em uma variável.
 *Crie outra variável de nome “outroTexto”, atribuindo o valor da variável
 *que o usuário digitou.
 *Altere o valor da variável que o usuário digitou para “Olá”.
 *Imprima as duas variáveis, e observe o que foi impresso.*/	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um texto:");
		String texto;
		texto = scanner.next();
		
		String outroTexto;
		outroTexto = texto;
		texto = ("olá");
		
		System.out.println("Primeiro texto = "+ texto + " Segundo texto = "+ outroTexto);
		scanner.close();
	}
}
