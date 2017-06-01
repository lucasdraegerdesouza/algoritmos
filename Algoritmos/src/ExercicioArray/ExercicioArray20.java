package ExercicioArray;

import java.util.Scanner;

public class ExercicioArray20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*20.Crie um array int com 3 posições e peça para o usuário digitar um valor,
 *e insira o valor na primeira posição do array, peça para o usuário digitar
 *outro valor e insira o valor na segunda posição do array,
 *peça para o usuário digitar outro valor e insira o valor terceira prosição
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
