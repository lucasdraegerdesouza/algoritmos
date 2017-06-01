package ExercicioArray;

public class ExercicioArray19 {
	public static void main(String[] args) {
/*19.Criar um array com os valores 1, 2, 3, 4, 5.
Criar outro array com os valores 5, 4, 3, 2, 1.
Utilizando for, imprimir em qual é as posições dos arrays que o valor é são iguais,
conforme exemplo abaixo:
arrayA posição 0, arrayB posição 4 possuem o valor 1
arrayA posição 1, arrayB posição 3 possuem o valor 2
*/		
		int number[] = new int[5];
		int number2[] = new int[5];
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;
		number[4] = 5;
		
		number2[0] = 5;
		number2[1] = 4;
		number2[2] = 3;
		number2[3] = 2;
		number2[4] = 1;
	for (int i = 0; i < number2.length; i++) {
		if (number[i] == number2[i]) {
			System.out.println("Array A posição " + number[i] + " Array B posição " + number2[i] + " Possuem o mesmo valor: "+ number[i]);
		}
	}
	}
}
