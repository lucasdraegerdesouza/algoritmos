package ExercicioArray;

import java.util.Scanner;

public class ExercicioArray23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*23.Crie um array de 6 posições com os valores 1, 2, 3, 4, 5, 6.
 *Percorra o array procurando um valor par, se encontado deve ser perguntado
 *para o usuário um novo valor para substituir o valor presente no array.*/	
		int number[] = new int[6];
			number[0] = 1;
			number[1] = 2;
			number[2] = 3;
			number[3] = 4;
			number[4] = 5;
			number[5] = 6;
			
			for (int i = 0; i < number.length; i++) {
				
				if (number[i] % 2 == 0) {
					System.out.println("Digite outro numero");
					number[i] = scanner.nextInt(); 
				}
				
			}
			scanner.close();
	}
}
