package ExercicioArray;

public class ExercicioArray15 {
	public static void main(String[] args) {
/*15.Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia
 * de inserção. Criar um outro array de mesmo tamanho.
 * Utilizando for, pegar todos os valores presentes no primeiro array
 * e inserir no segundo array de forma decrescente (2, 4, 6, 8, 10).
 * Desta forma os dois arrays terão os mesmo valores só que nas posições inversas.
 * Imprimir o segundo array para verificar se o algoritmo funcionou.*/
		int number[] = new int[5];
		int number2[] = new int[5];
		number[0] = 10;
		number[1] = 8;
		number[2] = 6;
		number[3] = 4;
		number[4] = 2;
		int j = 0;
		for (int i = number2.length - 1; i >= 0; i--) {
				number2[j] = number[i];
				System.out.println(number2[j]);
				j++;
			}
	
	}
}