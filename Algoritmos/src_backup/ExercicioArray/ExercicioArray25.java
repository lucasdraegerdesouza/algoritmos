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
		matriz[0][0] = 3;
		matriz[0][1] = 3;
		matriz[0][2] = 3;
		
		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 2;
		
		matriz[2][0] = 1;
		matriz[2][1] = 1;
		matriz[2][2] = 1;
		
		int somalinhas[] = new int[3];
		
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				somalinhas[linha] = somalinhas[linha] + matriz[linha][coluna];
				
			}
		}
		
		for (int linha = 0; linha < somalinhas.length; linha++) {
			for (int coluna = 0; coluna < somalinhas.length; coluna++) {
				matriz[linha][coluna] = somalinhas[linha];
				if (coluna == matriz[coluna].length - 1) {
					System.out.println("Soma da linha " + linha + ": " + somalinhas[linha]);
					
				}
			}
		}
	}
}
