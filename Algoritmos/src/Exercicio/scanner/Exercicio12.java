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
		System.out.println(true);
	}else {
		System.out.println(false);
	}
/*c.Imprima true se o resultado é maior que 10 ou maior que 1, caso contrário false.*/
	if (resultado > 10 | resultado > 1) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	scanner.close();								
					
			}
}
