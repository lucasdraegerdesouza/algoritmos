package ExercicioArray;

public class ExercicioArray17 {
	public static void main(String[] args) {
/*17.Criar um array com 10 posições, com valores de 1 a 10 sequenciais.
 *Criar um array de 5 posições.
 *Popular o segundo array somente com os valores ímpares do primeiro array
 *utilizando for. Imprimir o segundo array para verificar se o algoritmo funcionou*/
		int number[] = new int[10];
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;
		number[4] = 5;
		number[5] = 6;
		number[6] = 7;
		number[7] = 8;
		number[8] = 9;
		number[9] = 10;
		
		int number2[] = new int[5];
		int aux = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 1) {
				number2[aux] = number[i];
				System.out.println(number2[aux]);
				aux++;
				
			}
			
		}
	}
}