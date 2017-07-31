package ExercicioArray;

public class ExercicioArray05 {
	public static void main(String[] args) {
		/*5.Criar um array do tipo double,
		 * colocando os seguintes valores no array
		 * 1.0, 3.0, 5.0, 7.0.*/
		double[] number = new double[4];
		number[0] = 1.0;
		number[1] = 3.0;
		number[2] = 5.0;
		number[3] = 7.0;
		
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			}
	}
}
