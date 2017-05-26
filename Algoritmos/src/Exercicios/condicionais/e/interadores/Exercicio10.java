package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um numero double");
			double n1usr = scanner.nextDouble();
			
			System.out.println("Digite outro numero double");
			double n2usr = scanner.nextDouble();
			
			double soma2n = n1usr + n2usr;
			
			if (soma2n > 20 | soma2n > 10) {
				if (soma2n > 30) {
				System.out.println(+soma2n+ " é maior que 30");
			}else {
				System.out.println(+soma2n+" é maior que 10 ou "+soma2n+"maior que 20 ");
			}
			
			//if (soma2n > 10 | soma2n > 20) {
				//System.out.println(+soma2n+" é maior que 10 ou "+soma2n+"maior que 20 ");
			//}
			scanner.close();
				}
			if ((soma2n % 5 == 0 & soma2n % 10 == 0) | n1usr == 5) {
				System.out.println(+soma2n+" é múltiplo de 5 e "+soma2n+" de 10 ou o "+n1usr+" é 5");
			}
}
}