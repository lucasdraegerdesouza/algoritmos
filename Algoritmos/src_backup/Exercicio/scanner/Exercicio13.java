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
/*a.Imprima true se o valor do primeiro n�mero
 * � menor ou igual a soma do segundo n�mero com o terceiro
 * e o quarto n�mero, for impar ou maior que 10, caso contr�rio false.*/
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
/*b.Imprima true se a soma do primeiro d�gito
 *mais o segundo mais o terceiro mais o quarto d�gito for m�ltiplo de 10,
 *ou m�ltiplo de 5, ou o primeiro d�gito for 5,
 *ou a soma do primeiro d�gito mais o segundo e o terceiro d�gito,
 *for maior que 100.0, e o primeiro d�gito maior que 0.*/
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
/*c.Imprima true se o resultado da quest�o
 *a e o resultado da quest�o b forem verdadeiras,
 *ou o resultado da quest�o a e o resultado da quest�o b forem falsas.*/
	boolean itemC;
	if (itemA == true & itemB == true) {
		itemC = true;
		System.out.println("item C " + itemC);
	}else{
		itemC = false;
		System.out.println("item C " + itemC);
	}
/*d.Imprima false se o valor do primeiro d�gito mais o segundo,
 *terceiro e quarto for maior que 10, caso contr�rio true.*/
	boolean itemD;
	if (soma4numeros > 10) {
		itemD = true;
		System.out.print("item D " + itemD);
	}else{
		itemD = false;
		System.out.println("item D " + itemD);
	}
/*e.Imprima false se o primeiro n�mero � maior que 10
 *ou o terceiro n�mero for maior que 0,
 *ou o segundo n�mero mais o quarto n�mero for igual a 0.
 *Caso contr�rio true.*/	
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

