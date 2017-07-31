package ExercicioArray;

public class ExercicioArray10 {
	public static void main(String[] args) {
/*10.Criar um array do tipo int de 6 posições,
 *com os valores 1, 3, 5, 7, 9, 11.
 *Imprimir todas as posições menos a última posição
 *(verificar se é a última posições e não verificar se é o de valor 11).*/		
		int number[] = new int[6];
		number[0] = 1;
		number[1] = 3;
		number[2] = 5;
		number[3] = 7;
		number[4] = 9;
		number[5] = 11;
		for (int i = 0; i < number.length; i++) {
			if (i != (number.length - 1)) {
				System.out.println(number[i]);
			}
		}
	}
}
