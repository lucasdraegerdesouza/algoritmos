package Exercicio.scanner;

import java.text.DecimalFormat;

public class Exercicio23D {
	public static void main(String[] args) {
	double numero = 0.1 + 0.2;
	numero = 0.1 + 0.2;
	double outroNumero = numero;/* - 0.1; <- retirar*/
	numero = outroNumero;
	outroNumero = numero - 1;
	DecimalFormat df = new DecimalFormat("#0.0");/*Adicionei essa linha*/
	System.out.println(df.format(numero));

	}
}