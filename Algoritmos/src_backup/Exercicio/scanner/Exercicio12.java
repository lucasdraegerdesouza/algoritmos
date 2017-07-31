package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio12 {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int numero1;
	int numero2;
	int numero3;
	System.out.println("Digite um numero:");
	numero1 = scanner.nextInt();
	
	System.out.println("Digite outro numero:");
	numero2 = scanner.nextInt();
	
	System.out.println("Digite outro numero:");
	numero3 = scanner.nextInt();
	/*a.Imprima o resultado do seguinte cálculo
	*(primeiro número multiplicado pelo terceiro número mais,
	*o resultado somando com o segundo número elevado ao cubo).*/
	double resultado;
	resultado = (numero1 * numero3) + Math.pow(numero2, 3);
	System.out.println(resultado);		
	/*b.Imprima true se o resultado é maior que zero, caso contrário false.*/
	if (resultado > 0) {
		System.out.println(true + "Condição B true maior que zero");
	}else {
		System.out.println(false);
	}
/*c.Imprima true se o resultado é maior que 10 ou maior que 1, caso contrário false.*/
	if (resultado > 10 | resultado > 1) {
		System.out.println(true + "Condição C true maior que 1 e 10");
	}else {
		System.out.println(false);
	}
/*d.Imprima true se o resultado é menor que 10 ou maior que 100, caso contrário false. */
	if (resultado < 10 | resultado > 100) {
		System.out.println(true + "Condição D true menor que 10 ou maior que 100");
	}else {
		System.out.println(false);
	}
/*e.Imprima true se o resultado é múltiplo de 10, caso contrário false.*/
	if (resultado % 10 == 0) {
		System.out.println(true + "Condição E true multiplo de 10");
	}else {
		System.out.println(false);
	}
/*f.Imprima true se o resultado é múltiplo de 2 e múltiplo de 3, caso contrário false.*/
	if (resultado % 2 == 0 & resultado % 3 == 0) {
		System.out.println(true + "Condição F true multiplo de 2 e 3");
	}else {
		System.out.println(false);
	}
	scanner.close();								
					
			}
}
