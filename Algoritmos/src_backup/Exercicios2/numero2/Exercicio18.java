package Exercicios2.numero2;

public class Exercicio18 {
	public static void main(String[] args) {
		/*Imprimir uma lista com as 10 primeiras letras do alfabeto:
	A
	B
	C
	D
	E
	F
	G
	H
I
J*/
	int alfabeto = 0;
	while (alfabeto <= 9){
		alfabeto++;
		switch(alfabeto){
		case 1: System.out.println("A");
		break;
		case 2: System.out.println("B");
		break;
		case 3: System.out.println("C");
		break;
		case 4: System.out.println("D");
		break;
		case 5: System.out.println("E");
		break;
		case 6: System.out.println("F");
		break;
		case 7: System.out.println("G");
		break;
		case 8: System.out.println("H");
		break;
		case 9: System.out.println("I");
		break;
		case 10: System.out.println("J");
		break;
			}
		}
	}
}

