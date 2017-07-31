package ExercicioArray;

public class ExercicioArray26 {
	public static void main(String[] args) {
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
				somalinhas[coluna] = somalinhas[coluna] + matriz[linha][coluna];
			}
		}
		
		for (int linha = 0; linha < somalinhas.length; linha++) {
			for (int coluna = 0; coluna < somalinhas.length; coluna++) {
				matriz[linha][coluna] = somalinhas[coluna];
				if (coluna == matriz[coluna].length - 1) {
					System.out.println("Soma da coluna " + linha + ": " + somalinhas[coluna]);
					}
			}
		}
	}
}
