package Exercicio.scanner;

public class Exercicio23F {
	public static void main(String[] args) {
		
	boolean numero = true;
	String booleano = "false";
	numero = false | true;
	booleano = "false"; /*booleano = "false | false"; <- estava assim*/
	numero = false | numero;
	System.out.println(booleano );
	System.out.println(numero );

	}
}