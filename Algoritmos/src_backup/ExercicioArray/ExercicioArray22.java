package ExercicioArray;

import java.util.Scanner;



public class ExercicioArray22 {
	public static void main(String[] args) {
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
			if (number2 == number[j]) {
				achei = true;
		}
	}
		if (achei == true) {
			System.out.println("Achei o numero!");
		}else {
			System.out.println("Não achei o numero!");
		}
		scanner.close();
	}
}

	
		
		
		

