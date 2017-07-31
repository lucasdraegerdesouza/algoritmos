package ExercicioArray;

public class ExercicioArray16 {
	public static void main(String[] args) {
/*16.Criar um array com 10 posições. Inserir nas posições 2, 4, 5, 7
 *os respectivos valores “A”, “B”, “C”, “D”.
 *Com for ou while, inserir a letra “W” nas posições do array no qual não tem valor
 *(verificar a posição do array com null para validar se possui valor
 *ou não na posição do array, array[i] == null).
 *Imprimir o array para verificar se o algoritmo funcionou.
 *Fazer o exercício utilizando for ou while.*/		
		String number[] = new String[10];
		number[0] = null;
		number[1] = "A";
		number[2] = null;
		number[3] = "B";
		number[4] = "C";
		number[5] = null;
		number[6] = "D";
		number[7] = null;
		number[8] = null;
		number[9] = null;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == null) {
				number[i] = "w";
				System.out.println(number[i]);
			}else {
				System.out.println(number[i]);
			}
		}
		
	}
}
