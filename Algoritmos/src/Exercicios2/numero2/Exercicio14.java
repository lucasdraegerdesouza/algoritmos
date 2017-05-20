package Exercicios2.numero2;

public class Exercicio14 {
	public static void main(String[] args) {
/*14)	Imprima somente números que são múltiplos de 100, de -100 à 100;*/
		for (int n1 = -100; n1 <= 100; n1++){
			if(n1 % 100 == 0) 
			System.out.println(n1);
			}
	}
}
