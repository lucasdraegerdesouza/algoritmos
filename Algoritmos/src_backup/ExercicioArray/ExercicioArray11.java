package ExercicioArray;

public class ExercicioArray11 {
	public static void main(String[] args) {
/*11.Criar um array do tipo boolean de 6 posi��es.
*Utilizando um for, popular o array aonde as posi��es forem pares colocar o valor
*true, e nas posi��es �mpares o valor false.*/
		boolean number[] = new boolean[6];
		for (int i = 0; i < number.length; i++) {
			if (i % 2 == 0) {
				number[i] = true;
			}
		}
		
	}
}
