package ExercicioArray;

public class ExercicioArray18 {
	public static void main(String[] args) {
/*18.Criar um array de 10 posições, e popular este array apenas com múltiplos de 10,
 *ou seja, na posição 0 deverá ter o valor 10, na posição 1 o valor 20,
 *e assim por diante.*/		
		int number[] = new int[10];
		int mult = 10;
		for (int i = 0; i < number.length; i++) {
			number[i] = mult;
			System.out.println(number[i]);
			mult = mult + 10;
		}
	}
}
