package Exercicio.scanner;

public class Exercicio23A {
	public static void main(String[] args) {
	/*23.Diga se o código abaixo esta condizente com o que será impresso
 *no console, se não, o por que e diga o resultado correto.*/
	String texto = "Vinícius";
	String outroTexto = texto + "Ferneda";
	texto = outroTexto + "Ferneda";
	System.out.println(outroTexto);
	/*no lugar da variavel outroTexto deveria ser a variavel texto*/
	}
}
