package ExercicioArray;

public class ExercicioArray10 {
	public static void main(String[] args) {
/*10.Criar um array do tipo int de 6 posi��es,
 *com os valores 1, 3, 5, 7, 9, 11.
 *Imprimir todas as posi��es menos a �ltima posi��o
 *(verificar se � a �ltima posi��es e n�o verificar se � o de valor 11).*/		
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
