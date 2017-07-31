package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
/*14.Um comerciante comprou um produto e quer vende-lo
*com um lucro de 50% se o valor da compra for
*menor que R$ 20,00. Caso contrário, o lucro será 35%.
*Entrar com o valor do produto e imprimir o valor de venda.*/		
		Scanner scanner = new Scanner(System.in);
			System.out.println("Informe o valor do seu produto: ");
			double valorpro = scanner.nextDouble();
			
			if (valorpro < 20) {
				double lucroprod = (valorpro * 50) / 100;
				valorpro = valorpro + lucroprod;
				System.out.println("O valor final do seu produto deve ser: "+valorpro);
			}else {
				double lucroprod = (valorpro * 35) / 100;
				valorpro = valorpro + lucroprod;
				System.out.println("O valor final do seu produto deve ser: "+valorpro);
			}
		scanner.close();
	}
	

}
