package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio06 {
/*6.Pe�a para o usu�rio digitar a cidade onde mora,
 * armazene o valor em vari�vel.
 * Pe�a para o usu�rio digitar o bairro onde mora,
 * armazene o valor em vari�vel.
 * Com tais informa��es efetue as seguintes condi��es:*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Informe a cidade onde voc� mora;");
			String cidadeusr = scanner.nextLine();
			
			System.out.println("Informe o bairro onde voc� mora;");
			String bairrousr = scanner.nextLine();
			
		/*a.Verifique se o usu�rio mora em �Blumenau� e no bairro �Velha�,*/
		/*caso sim, imprima �Voc� se atrasar� para o trabalho!�.*/
			if (cidadeusr.equalsIgnoreCase("Blumenau") & bairrousr.equalsIgnoreCase("Velha")) {
				System.out.println("Voc� se atrasar� para o trabalho!");
			}
					
/*b.Verifique se o usu�rio mora em �Blumenau� e no bairro �Fortaleza�,
 *caso sim, imprima �Voc� se atrasar� muito mais para o trabalho!�.*/
			if (cidadeusr.equalsIgnoreCase("Blumenau") & bairrousr.equalsIgnoreCase("Fortaleza")) {
				System.out.println("Voc� se atrasar� muito mais para o trabalho!");
			}
/*c.Verifique se o usu�rio mora em �Blumenau� e no bairro �Garcia�,
 *caso sim, imprima �Voc� tem que sair de madrugada para n�o pegar tr�nsito!�.*/
			if (cidadeusr.equalsIgnoreCase("Blumenau") & bairrousr.equalsIgnoreCase("Garcia")) {
				System.out.println("Voc� tem que sair de madrugada para n�o pegar tr�nsito!");
			}
/*d.	Verifique se o usu�rio mora em �Gaspar� e no bairro �Belchior�, caso sim,
			 *imprima �OK, voc� gosta de pegar tr�nsito!�.*/
			if (cidadeusr.equalsIgnoreCase("Gaspar") & bairrousr.equalsIgnoreCase("Belchior")) {
				System.out.println("OK, voc� gosta de pegar tr�nsito!");
			}
/*e.Verifique se o usu�rio mora em �Blumenau� e no bairro �Bela vista�, caso sim,
 *imprima �Pegue carona com quem v�em de Gaspar, economiza gasolina!�.*/
			if (cidadeusr.equalsIgnoreCase("Blumenau") & bairrousr.equalsIgnoreCase("Bela vista")) {
				System.out.println("Pegue carona com quem v�em de Gaspar, economiza gasolina!");
			}
/*f.No final pe�a para o usu�rio responder a pergunta
 *�Voc� concorda com o que eu disse?� utilizando System.out.println
 *e pegue o que o usu�rio digitar com Scanner.
 *Caso o usu�rio digitar true, imprima �Show de bola�,
 *caso contr�rio �Ok, problema � nosso!�.*/
			System.out.println("Voc� concorda com o que eu disse?");
			String concordausr = scanner.nextLine();
			
			if (concordausr.equalsIgnoreCase("Sim")) {
				System.out.println("Show de bola");
			}else {
				System.out.println("Ok, problema � nosso");
			}
			
		scanner.close();
	}
}
