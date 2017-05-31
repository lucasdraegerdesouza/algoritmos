package ExercicioArray;

import java.util.Arrays;

public class ExercicioArray07 {
	public static void main(String[] args) {
/*7.Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”*/
		String letras[] = new String[6];
		letras[0] = "A";
		letras[1] = "B";
		letras[2] = "C";
		letras[3] = "D";
		letras[4] = "E";
		letras[5] = "F";
		
/*a.Imprimir todos os valores do array*/
		System.out.println("letra A");
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
/*b.Imprimir todos os valores do array de forma contrário, ou seja,
 * “F”, “E”, “D”, “C”, “B”, “A”*/
		Arrays.sort(letras);
		System.out.println(" ");
		System.out.println("letra B");
		System.out.println(letras[5]);
		System.out.println(letras[4]);
		System.out.println(letras[3]);
		System.out.println(letras[2]);
		System.out.println(letras[1]);
		System.out.println(letras[0]);

/*c.	Imprimir todos os valores do array menos que tenha o valor “C”*/
		System.out.println(" ");
		System.out.println("Letra C");
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] != "C") {
				System.out.println(letras[i]);
			}
		}
	}
}
