package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio06 {
/*6.Peça para o usuário digitar a cidade onde mora,
 * armazene o valor em variável.
 * Peça para o usuário digitar o bairro onde mora,
 * armazene o valor em variável.
 * Com tais informações efetue as seguintes condições:*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Informe a cidade onde você mora;");
			String cidadeusr = scanner.nextLine();
			
			System.out.println("Informe o bairro onde você mora;");
			String bairrousr = scanner.nextLine();
			
		/*a.Verifique se o usuário mora em “Blumenau” e no bairro “Velha”,*/
		/*caso sim, imprima “Você se atrasará para o trabalho!”.*/
			if (cidadeusr.equalsIgnoreCase("Blumenau") & bairrousr.equalsIgnoreCase("Velha")) {
				System.out.println("Você se atrasará para o trabalho!");
			}
					
/*b.Verifique se o usuário mora em “Blumenau” e no bairro “Fortaleza”,
 *caso sim, imprima “Você se atrasará muito mais para o trabalho!”.*/
			if (cidadeusr.equalsIgnoreCase("Blumenau") & bairrousr.equalsIgnoreCase("Fortaleza")) {
				System.out.println("Você se atrasará muito mais para o trabalho!");
			}
/*c.Verifique se o usuário mora em “Blumenau” e no bairro “Garcia”,
 *caso sim, imprima “Você tem que sair de madrugada para não pegar trânsito!”.*/
			if (cidadeusr.equalsIgnoreCase("Blumenau") & bairrousr.equalsIgnoreCase("Garcia")) {
				System.out.println("Você tem que sair de madrugada para não pegar trânsito!");
			}
/*d.	Verifique se o usuário mora em “Gaspar” e no bairro “Belchior”, caso sim,
			 *imprima “OK, você gosta de pegar trânsito!”.*/
			if (cidadeusr.equalsIgnoreCase("Gaspar") & bairrousr.equalsIgnoreCase("Belchior")) {
				System.out.println("OK, você gosta de pegar trânsito!");
			}
/*e.Verifique se o usuário mora em “Blumenau” e no bairro “Bela vista”, caso sim,
 *imprima “Pegue carona com quem vêem de Gaspar, economiza gasolina!”.*/
			if (cidadeusr.equalsIgnoreCase("Blumenau") & bairrousr.equalsIgnoreCase("Bela vista")) {
				System.out.println("Pegue carona com quem vêem de Gaspar, economiza gasolina!");
			}
/*f.No final peça para o usuário responder a pergunta
 *“Você concorda com o que eu disse?” utilizando System.out.println
 *e pegue o que o usuário digitar com Scanner.
 *Caso o usuário digitar true, imprima “Show de bola”,
 *caso contrário “Ok, problema é nosso!”.*/
			System.out.println("Você concorda com o que eu disse?");
			String concordausr = scanner.nextLine();
			
			if (concordausr.equalsIgnoreCase("Sim")) {
				System.out.println("Show de bola");
			}else {
				System.out.println("Ok, problema é nosso");
			}
			
		scanner.close();
	}
}
