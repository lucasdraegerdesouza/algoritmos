package ExercicioArray;

public class ExercicioArray08 {
	public static void main(String[] args) {
/*8.Criar um array do tipo int, com os seguintes valores 1, 2, 3, 4, 5.*/
	int number[] = new int[5];
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;
		number[4] = 5;

/*a.Imprimir todos os valores do array até chegar a metade do array.*/
		System.out.println("Letra A");
		for (int i = 0; i < number.length / 2; i++) {
			System.out.println(number[i]);
		}
/*b.Alterar o valor do início do array para 10.*/

		System.out.println("Letra B");
		number[0] = 10;
		System.out.println(number[0]);
/*c.Alterar o valor da última posição do array para 10.*/		

		System.out.println("Letra C");
		number[4] = 10;
		System.out.println(number[4]);
/*d.	Imprimir todos os valores do array.*/	

		System.out.println("Letra D");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
 
}
