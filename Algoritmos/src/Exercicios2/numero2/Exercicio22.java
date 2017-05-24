package Exercicios2.numero2;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a quantidade de linhas:");
		int qtdLinhas = scanner.nextInt();
		for(int linha = 1; linha <= qtdLinhas; linha++){
			for(int coluna = 1; coluna <= linha; coluna++){
				if(linha < 10){
					System.out.print("0"+linha+" ");
				}else{
					System.out.print(linha+" ");
				}
			}
			System.out.println("");
		}
		scanner.close();
	}
	
}
