package Exercicios2.numero2;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
/*20)	Perguntar para o usuário o início da lista e o final da lista que ele quer se seja impressa e imprimir esta lista.*/
		Scanner scanner = new Scanner(System.in);
		int numusuario1;
		int numusuario2;
		System.out.println("Digite o numero inicial:");
		numusuario1 = scanner.nextInt();
		System.out.println("Digite até qual numero desejas:");
		numusuario2 = scanner.nextInt();
		while (numusuario1 <= numusuario2){
		System.out.println(numusuario1);
		numusuario1++;
		scanner.close();
	}
	}
}
