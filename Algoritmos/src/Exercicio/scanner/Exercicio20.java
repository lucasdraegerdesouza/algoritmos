package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio20 {
/*20.Pe�a para o usu�rio digitar um texto.
 *Guarde o texto que o usu�rio digitou em uma vari�vel.
 *Crie outra vari�vel de nome �outroTexto�, atribuindo o valor da vari�vel
 *que o usu�rio digitou.
 *Altere o valor da vari�vel que o usu�rio digitou para �Ol�.
 *Imprima as duas vari�veis, e observe o que foi impresso.*/	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um texto:");
		String texto;
		texto = scanner.next();
		
		String outroTexto;
		outroTexto = texto;
		texto = ("ol�");
		
		System.out.println("Primeiro texto = "+ texto + " Segundo texto = "+ outroTexto);
		scanner.close();
	}
}
