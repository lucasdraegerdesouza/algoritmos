package ExercicioArray;

import java.util.Scanner;



public class ExercicioArray22 {
	public static void main(String[] args) {
/*22.Crie um array de 5 posi��es com os valores 1, 3, 5, 7, 9.
 Pe�a para o usu�rio digitar um valor. Se o valor digitado pelo usu�rio
 estiver no array, imprima �Achei o valor�, caso contr�rio,
 n�o achei o valor. (o System.out.println deve estar fora do for).*/		
		Scanner scanner = new Scanner(System.in);
		
		int number[] = new int[10];
		int number2;
		boolean achei = false;
		number[0] = 1;
		number[1] = 3;
		number[2] = 5;
		number[3] = 7;
		number[4] = 9;
		
		
		
		System.out.println("Digite um Numero:");
		number2 = scanner.nextInt();
		
		for (int j = 0; j < number.length; j++) {	
			if (number[j] == number2) {
			achei = true;
		}else {
			achei = false;
		}
	}
		if (achei == true) {
			System.out.println("Achei o numero!");
		}else {
			System.out.println("N�o achei o numero!");
		}
		scanner.close();
	}
}