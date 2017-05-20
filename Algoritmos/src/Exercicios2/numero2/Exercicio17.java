package Exercicios2.numero2;

public class Exercicio17 {
	public static void main(String[] args) {
		/*17)	Imprimir uma lista semelhante a lista abaixo:
		1_10
		 2_9
		 3_8
		 4_7
		 5_6
		 6_5
		 7_4
		 8_3
		 9_2
		10_1*/
		int n1 = 0;
		int n2 = 11;
		while (n1 <= 9 & n2 >= 1){
		n1++;
		n2--;
		System.out.println(n1+ "_" +n2);
		}
	}
}
