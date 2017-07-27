/**
 * Classe responsavel pelas classes de uma conta
 */
package Interfaces;
/**
 * Classe responsavel pelo extrato de uma conta
 * @author Lucas Draeger de Souza
 *
 */
public class Extrato {
	/**
	 * Metodo responsavel por gerar o extrato de cada conta
	 * @param c
	 */
	public static void geradorExtrato(IContas c){
		System.out.println("Saldo da Conta = "+c.saldo());
		System.out.println("Saldo da Conta = "+c.saldo());
	}
}
