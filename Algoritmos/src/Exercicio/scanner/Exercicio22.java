package Exercicio.scanner;

public class Exercicio22 {
/*22.Crie uma vari�vel de nome �teste� do tipo boolean com o valor true.
 *Crie outra vari�vel de nome �outroTeste� do tipo boolean com o valor false.
 *Imprima os valores das duas vari�veis.
 *Coloque o valor da vari�vel �teste� na vari�vel �outroTeste�.
 *Imprima novamente ambas as vari�veis.
 *Agora coloque o valor false na vari�vel �teste�,
 *e imprima ambas as vari�veis novamente. Verifique o que aconteceu.*/	
	public static void main(String[] args) {
		boolean teste = true;
		boolean outroTeste = false;
		System.out.println("Variavel teste = "+ teste);
		System.out.println("Variavel outroteste = "+ outroTeste);
		outroTeste = teste;
		System.out.println("Variavel teste = "+ teste);
		System.out.println("Variavel outroteste = "+ outroTeste);
		teste = false;
		System.out.println("Variavel teste = "+ teste);
		System.out.println("Variavel outroteste = "+ outroTeste);
		
	}
}
