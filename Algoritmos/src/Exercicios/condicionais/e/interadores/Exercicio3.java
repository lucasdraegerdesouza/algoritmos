package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*3.Peça para o usuário digitar dois números,
 *pegue os dois números que o usuário digitou.
 *Multiplique os dois números.
 *Se o resultado da multiplicação for múltiplo de 5 imprima
 *“o resultado é múltiplo de 5”,
 *caso contrário, imprima “o resultado não foi o esperado”.
 *Após o teste da da condição do if, imprima o resultado da multiplicação.*/
		System.out.println("Digite um numero");
		int numero1 = scanner.nextInt();
		System.out.println("Digite outro numero");
		int numero2 = scanner.nextInt();
		int multiplicacao;
		multiplicacao = numero1 * numero2;
		if (multiplicacao % 5 == 0) {
			System.out.println("o resultado é múltiplo de 5");
		} else {
			System.out.println("o resultado não foi o esperado");
		}
		System.out.println("Resultado da multiplicação = "+ multiplicacao);
		scanner.close();
	}
}