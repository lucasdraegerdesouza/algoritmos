package ExercicioArray;

import java.util.Arrays;

public class ExercicioArray06 {
	public static void main(String[] args) {
/*6.	Criar um array do tipo int, com valores de 0 � 5.*/

		int number[] = new int[6];
		number[0] = 1;
		number[1] = 5;
		number[2] = 3;
		number[3] = 4;
		number[4] = 0;
		number[5] = 2;

		
		
		/*a.Imprimir todos os valores do array*/
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			}
/*b.Imprimir todos os valores do array de forma decrescente*/
			Arrays.sort(number);
			System.out.println(number[5]);
			System.out.println(number[4]);
			System.out.println(number[3]);
			System.out.println(number[2]);
			System.out.println(number[1]);
			System.out.println(number[0]);
		
	}
}