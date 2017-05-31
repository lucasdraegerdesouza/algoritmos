package ExercicioArray;

public class ExercicioArray11 {
	public static void main(String[] args) {
/*11.Criar um array do tipo boolean de 6 posições.
*Utilizando um for, popular o array aonde as posições forem pares colocar o valor
*true, e nas posições ímpares o valor false.*/
		boolean number[] = new boolean[6];
		for (int i = 0; i < number.length; i++) {
			if (i % 2 == 0) {
				number[i] = true;
			}
		}
		
	}
}
