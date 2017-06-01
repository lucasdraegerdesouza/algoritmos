package ExercicioArray;


public class ExercicioArray25 {
	public static void main(String[] args) {
/*25.Criar uma matriz com 3 linhas e 3 colunas.
 * Popular esta matriz da forma tradicional (matriz[0][0] = 1;)
 * com os valores desejados. Utilizando for, efetuar a soma dos valores
 * de cada linha e imprimir apenas os valores somados da linha.
 * Ou seja, conforme matriz abaixo:
		3 3 3
		2 2 2
		1 1 1
*/		
		int[][] matriz = new int[3][3];
		matriz[0][0] = 1;
		matriz[1][1] = 1;
		matriz[2][2] = 1;
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + 2);
		
			
		}
	}
}
