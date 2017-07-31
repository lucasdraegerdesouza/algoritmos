package ExercicioArray;

import java.util.Scanner;

public class ExercicioArray24 {
	public static void main(String[] args) {
/*24.Criar um array de char com os seguintes valores,
‘e’, ‘s’, ‘t’, ‘a’, ‘ ’, ‘a’, ‘c’, ‘a’, ‘b’, ‘a’, ‘n’, ‘d’, ‘o’, ‘ ’, ‘a’, ‘ ’, ‘a’
‘u’, ‘l’, ‘a’.
Percorrer o array de char, e armazenar em uma String, para formar o
seguinte texto, “esta acabando a aula”.
Imprimir este texto no final com o valor da variável String.*/		
		Scanner scanner = new Scanner(System.in);
		String letras[] = new String[20];
			letras[0] = "e";
			letras[1] = "s";
			letras[2] = "t";
			letras[3] = "a";
			letras[4] = " ";
			letras[5] = "a";
			letras[6] = "c";
			letras[7] = "a";
			letras[8] = "b";
			letras[9] = "a";
			letras[10] = "n";
			letras[11] = "d";
			letras[12] = "o";
			letras[13] = " ";
			letras[14] = "a";
			letras[15] = " ";
			letras[16] = "a";
			letras[17] = "u";
			letras[18] = "l";
			letras[19] = "a";
			
			for (int i = 0; i < letras.length; i++) {
				System.out.print(letras[i]);
			}
		scanner.close();
	}
}