package ExercicioArray;

public class ExercicioArray13 {
	public static void main(String[] args) {
/*13.Criar um array de 10 posi��es, e popular o array com os valores
 *1, 2, 3, 4, 5 a partir da posi��o 4 utilizando for.
 *Para colocar os valores 1, 2, 3, 4, 5 utilizando uma vari�vel.*/		
		int number[] = new int[10];
		
		
		int y = 1;
		for (int i = 3; i < number.length; i++) {
			number[i] = y;
			y++;
		}
	}
}
