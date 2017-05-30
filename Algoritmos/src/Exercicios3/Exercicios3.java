package Exercicios3;

import java.io.StreamCorruptedException;
import java.util.Scanner;

public class Exercicios3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			double pizzas[] = new double[15];
						
			System.out.println("Qual o valor da pizza de calabresa:");
			pizzas[0] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de 4 queijos:");
			pizzas[1] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de frango:");
			pizzas[2] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de lombinho:");
			pizzas[3] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de coração:");
			pizzas[4] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de carne:");
			pizzas[5] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de strogonoff de frango:");
			pizzas[6] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de strogonoff de carne:");
			pizzas[7] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de 5 queijos:");
			pizzas[8] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de banana split:");
			pizzas[9] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de sonho de valsa:");
			pizzas[10] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de prestígio:");
			pizzas[11] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de chocolate preto:");
			pizzas[12] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de chocolate branco:");
			pizzas[13] = scanner.nextDouble();
			System.out.println("Qual o valor da pizza de coco:");
			pizzas[14] = scanner.nextDouble();
			
			String cardapio[] = new String[15];
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de 4 queijos = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de frango = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de lombinho = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			cardapio[1] = "pizza de calabresa = " + Double.toString(pizzas[1]);
			
			
			
		for (int i = 0; i < pizzas.length; i++) {
			System.out.println(cardapio[i] + pizzas[i]);
		}
		scanner.close();
	}
}
