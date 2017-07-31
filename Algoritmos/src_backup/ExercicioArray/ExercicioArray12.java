package ExercicioArray;

public class ExercicioArray12 {
	public static void main(String[] args) {
/*12.Criar um array do tipo boolean com 3 posições,
 *com os valores true, false, true.
 *Utilizando for, verifique se comparado todos os valores
 *boleanos do array com o operador ou (|) é verdadeiro,
 *caso sim imprima “1”, caso contrário “2”.*/		
		boolean number[] = new boolean[3];
		number[0] = true;
		number[1] = false;
		number[2] = true;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == true) {
				System.out.println("1");
			}else {
				System.out.println("2");
			}
		}
	}
}
