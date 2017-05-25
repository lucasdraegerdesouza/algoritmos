package Exercicio.scanner;

public class Exercicio23C {
	public static void main(String[] args) {
		int numero = 10;
		int outroNumero = numero;
		outroNumero = outroNumero + 10;
		numero = outroNumero;
		numero = outroNumero + 1;
		System.out.println(numero);
		outroNumero = numero + 1;
		System.out.println(numero + 1);
		/*tirar + 1 do primeiro resultado exibido na tela
		 *e adicionar + 1 no segundo resultado*/

	}
}
