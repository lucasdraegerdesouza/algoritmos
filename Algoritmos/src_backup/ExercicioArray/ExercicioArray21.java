package ExercicioArray;

import java.util.Scanner;

public class ExercicioArray21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*21.Crie um array com 10 posições e peça para o usuário digitar um número
 e colocar este número no array. Enquanto o array não tiver chego no final
 deverá sempre perguntar para o usuário um próximo número e inserir no array.
 Deverá ser utilizar while ou for.*/
		int number[] = new int[10];
		for (int i = 0; i < number.length; i++) {
			System.out.println("Digite um Numero:");
			number[i] = scanner.nextInt();
			scanner.close();
		}
	}
}