package Exercicio.scanner;

public class Exercicio22 {
/*22.Crie uma variável de nome “teste” do tipo boolean com o valor true.
 *Crie outra variável de nome “outroTeste” do tipo boolean com o valor false.
 *Imprima os valores das duas variáveis.
 *Coloque o valor da variável “teste” na variável “outroTeste”.
 *Imprima novamente ambas as variáveis.
 *Agora coloque o valor false na variável “teste”,
 *e imprima ambas as variáveis novamente. Verifique o que aconteceu.*/	
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
