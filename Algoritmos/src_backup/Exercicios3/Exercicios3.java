package Exercicios3;



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
			cardapio[0] = "pizza de calabresa = ";
			cardapio[1] = "pizza de 4 queijos = ";
			cardapio[2] = "pizza de frango = ";
			cardapio[3] = "pizza de lombinho = ";
			cardapio[4] = "pizza de coração = ";
			cardapio[5] = "pizza de carne = ";
			cardapio[6] = "pizza de strogonoff de frango = ";
			cardapio[7] = "pizza de strogonoff de carne = ";
			cardapio[8] = "pizza de 5 queijos = ";
			cardapio[9] = "pizza de banana split = ";
			cardapio[10] = "pizza de sonho de valsa = ";
			cardapio[11] = "pizza de prestígio = ";
			cardapio[12] = "pizza de chocolate preto = ";
			cardapio[13] = "pizza de chocolate branco = ";
			cardapio[14] = "pizza de coco = ";
			
						
		for (int i = 0; i < pizzas.length; i++) {
			System.out.println(cardapio[i] + pizzas[i]);
		}
		
		int garcom;
		System.out.println("Digite o numero da pizza:");
		garcom = scanner.nextInt();
		
		switch (garcom) {
		case 1:
			System.out.println("O valor do seu pedido é de "+ pizzas[0]);
		break;
		case 2:
			System.out.println("O valor do seu pedido é de "+ pizzas[1]);
		break;
		case 3:
			System.out.println("O valor do seu pedido é de "+ pizzas[2]);
		break;
		case 4:
			System.out.println("O valor do seu pedido é de "+ pizzas[3]);
		break;
		case 5:
			System.out.println("O valor do seu pedido é de "+ pizzas[4]);
		break;
		case 6:
			System.out.println("O valor do seu pedido é de "+ pizzas[5]);
		break;
		case 7:
			System.out.println("O valor do seu pedido é de "+ pizzas[6]);
		break;
		case 8:
			System.out.println("O valor do seu pedido é de "+ pizzas[7]);
		break;
		case 9:
			System.out.println("O valor do seu pedido é de "+ pizzas[8]);
		break;
		case 10:
			System.out.println("O valor do seu pedido é de "+ pizzas[9]);
		break;
		case 11:
			System.out.println("O valor do seu pedido é de "+ pizzas[10]);
		break;
		case 12:
			System.out.println("O valor do seu pedido é de "+ pizzas[11]);
		break;
		case 13:
			System.out.println("O valor do seu pedido é de "+ pizzas[12]);
		break;
		case 14:
			System.out.println("O valor do seu pedido é de "+ pizzas[13]);
		break;
		case 15:
			System.out.println("O valor do seu pedido é de "+ pizzas[14]);
		break;
		default: System.out.println("Seu pedido não é valido");
		}
		scanner.close();
	}
}
