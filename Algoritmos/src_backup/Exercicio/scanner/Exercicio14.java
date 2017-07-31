package Exercicio.scanner;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		int anonascimento;
		int telefone;
		String cidadenatal;
		
		System.out.println("Digite seu nome:");
		nome = scanner.nextLine();
		
		System.out.println("Digite ano em que você nasceu:");
		anonascimento = scanner.nextInt();
		
		System.out.println("Digite seu telefone:");
		telefone = scanner.nextInt();
		
		System.out.println("Digite sua cidade natal:");
		cidadenatal = scanner.next();
		int idade = 2017 - anonascimento;
		
		System.out.println("Meu nome é " + nome +", nasci no ano de "+ anonascimento +", tenho " + idade +" anos. Se você quiser entrar em contato comigo, pode ligar para o telefone " + telefone +". Há esqueci de te dizer aonde eu nasci, foi na cidade de "+ cidadenatal);
		
		
	scanner.close();
	}
}