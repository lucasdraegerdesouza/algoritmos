package ExercicioArray;

public class ExercicioArray16 {
	public static void main(String[] args) {
/*16.Criar um array com 10 posi��es. Inserir nas posi��es 2, 4, 5, 7
 *os respectivos valores �A�, �B�, �C�, �D�.
 *Com for ou while, inserir a letra �W� nas posi��es do array no qual n�o tem valor
 *(verificar a posi��o do array com null para validar se possui valor
 *ou n�o na posi��o do array, array[i] == null).
 *Imprimir o array para verificar se o algoritmo funcionou.
 *Fazer o exerc�cio utilizando for ou while.*/		
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
