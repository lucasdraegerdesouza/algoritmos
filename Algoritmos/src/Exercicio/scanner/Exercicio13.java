package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		System.out.println("Digite um numero:");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite outro numero:");
		numero2 = scanner.nextInt();
		
		System.out.println("Digite outro numero:");
		numero3 = scanner.nextInt();
		
		System.out.println("Digite outro numero:");
		numero4 = scanner.nextInt();
/*a.Imprima true se o valor do primeiro número
 * é menor ou igual a soma do segundo número com o terceiro
 * e o quarto número, for impar ou maior que 10, caso contrário false.*/
	boolean itemA;
	int resultadoA;
	resultadoA = numero2 + numero3 + numero4;
	if (numero1 <= resultadoA & resultadoA % 2 == 1 & resultadoA > 10) {
		itemA = true;
		System.out.println("item A " + itemA);
	}else{
		itemA = false;
		System.out.println("item A " + itemA);	
		}
/*b.Imprima true se a soma do primeiro dígito
 *mais o segundo mais o terceiro mais o quarto dígito for múltiplo de 10,
 *ou múltiplo de 5, ou o primeiro dígito for 5,
 *ou a soma do primeiro dígito mais o segundo e o terceiro dígito,
 *for maior que 100.0, e o primeiro dígito maior que 0.*/
	boolean itemB;
	double soma4numeros;
	soma4numeros = numero1 + numero2 + numero3 + numero4;
	double soma3numeros;
	soma3numeros = numero1 + numero2 + numero3;
	
	if (soma4numeros % 10 == 0 & numero1 % 5 == 0 & soma3numeros > 100 & numero1 > 0) {
		itemB = true;
		System.out.println("item B " + itemB);
	}else{
		itemB = false;
		System.out.println("item B " + itemB);
	}
/*c.Imprima true se o resultado da questão
 *a e o resultado da questão b forem verdadeiras,
 *ou o resultado da questão a e o resultado da questão b forem falsas.*/
	boolean itemC;
	if (itemA == true & itemB == true) {
		itemC = true;
		System.out.println("item C " + itemC);
	}else{
		itemC = false;
		System.out.println("item C " + itemC);
	}
/*d.Imprima false se o valor do primeiro dígito mais o segundo,
 *terceiro e quarto for maior que 10, caso contrário true.*/
	boolean itemD;
	if (soma4numeros > 10) {
		itemD = true;
		System.out.print("item D " + itemD);
	}else{
		itemD = false;
		System.out.println("item D " + itemD);
	}
/*e.Imprima false se o primeiro número é maior que 10
 *ou o terceiro número for maior que 0,
 *ou o segundo número mais o quarto número for igual a 0.
 *Caso contrário true.*/	
	boolean itemE;
	double soma2e4;
	soma2e4 = numero2 + numero4;
	if (numero1 > 10 & numero3 > 0 & soma2e4 == 0) {
		itemE = true;
		System.out.println("item E " + itemE);
	}else{
		itemE = false;
		System.out.println("item E " + itemE);
	}
	scanner.close();
	}
	
}

