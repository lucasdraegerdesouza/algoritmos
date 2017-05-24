package Exercicios2.numero2;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a quantidade de linhas:");
		int qtdLinhas = scanner.nextInt();
		int numero = qtdLinhas;
		for(int linha = 1; linha <= qtdLinhas; linha++){
			for(int coluna = qtdLinhas; coluna >= linha; coluna--){
				if(numero < 10){
					System.out.print("0"+numero+" ");
				}else{
					System.out.print(numero+" ");
				}
			}
			numero--;
			System.out.println("");
		}
		scanner.close();
	}
}
