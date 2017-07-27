/**
 * Classe responsavel pelas classes de uma conta
 */
package Interfaces;
/**
 * Classe responsavel por uma conta
 * @author Lucas Draeger de Souza
 *
 */
public abstract class Conta implements IContas{
	/**
	 * Variavel numero responsavel pelo numero da conta
	 */
	private String numero;
	/**
	 * Variavel saldo responsavel pelo saldo de uma conta
	 */
	private double saldo;
	/**
	 * Variavel agencia responsavel pelo numero da agencia
	 */
	private String agencia;
	
	/**
	 * geters e seters da variavel numero
	 * @return
	 */
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/**
	 * geters e seters da variavel saldo
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * geters e seters da variavel agencia
	 * @return
	 */
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}
