package ExercicioArray;

import java.util.Scanner;

public class ExercicioArray20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*20.Crie um array int com 3 posi��es e pe�a para o usu�rio digitar um valor,
 *e insira o valor na primeira posi��o do array, pe�a para o usu�rio digitar
 *outro valor e insira o valor na segunda posi��o do array,
 *pe�a para o usu�rio digitar outro valor e insira o valor terceira prosi��o
 *do array.*/
		
		int number[] = new int[3];
		System.out.println("Digite um Numero:");
		number[0] = scanner.nextInt();
		System.out.println("Digite um Numero:");
		number[1] = scanner.nextInt();
		System.out.println("Digite um Numero:");
		number[2] = scanner.nextInt();
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		scanner.close();
	}
}
