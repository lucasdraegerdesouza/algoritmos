package ExercicioArray;

public class ExercicioArray18 {
	public static void main(String[] args) {
/*18.Criar um array de 10 posi��es, e popular este array apenas com m�ltiplos de 10,
 *ou seja, na posi��o 0 dever� ter o valor 10, na posi��o 1 o valor 20,
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
