package ExercicioArray;

import java.util.Scanner;

public class ExercicioArray21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*21.Crie um array com 10 posi��es e pe�a para o usu�rio digitar um n�mero
 e colocar este n�mero no array. Enquanto o array n�o tiver chego no final
 dever� sempre perguntar para o usu�rio um pr�ximo n�mero e inserir no array.
 Dever� ser utilizar while ou for.*/
		int number[] = new int[10];
		for (int i = 0; i < number.length; i++) {
			System.out.println("Digite um Numero:");
			number[i] = scanner.nextInt();
			scanner.close();
		}
	}
}