package Exercicios.condicionais.e.interadores;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			double n1usr = scanner.nextDouble();
			
			System.out.println("Digite um operador matematico: ");
			String operadormat = scanner.next();
			
			System.out.println("Digite um numero: ");
			double n2usr = scanner.nextDouble();
			
			DecimalFormat df = new DecimalFormat("#0.00");
			
			/*Adi��o*/
			if (operadormat.equalsIgnoreCase("+")) {
				double resultadosoma = n1usr + n2usr;
				System.out.println("O numero: " +n1usr+ " + " +n2usr+ " = " +df.format(resultadosoma));
			}
			/*Subtra��o*/
			if (operadormat.equalsIgnoreCase("-")) {
				double resultadosoma = n1usr - n2usr;
				System.out.println("O numero: " +n1usr+ " - " +n2usr+ " = " +df.format(resultadosoma));
			}
			/*Divis�o*/
			if (operadormat.equalsIgnoreCase("/")) {
				double resultadosoma = n1usr / n2usr;
				System.out.println("O numero: " +n1usr+ " / " +n2usr+ " = " +df.format(resultadosoma));
			}
			/*Multiplica��o*/
			if (operadormat.equalsIgnoreCase("*")) {
				double resultadosoma = n1usr * n2usr;
				System.out.println("O numero: " +n1usr+ " * " +n2usr+ " = " +df.format(resultadosoma));
			}
		scanner.close();
	}
}
