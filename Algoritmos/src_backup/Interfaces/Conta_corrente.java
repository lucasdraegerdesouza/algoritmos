/**
 * Classe responsavel pelas classes de uma conta
 */
package Interfaces;
/**
 * Classe responsavel por uma conta corrente que herda os atributos de conta 
 * @author Lucas Draeger de Souza
 *
 */
public class Conta_corrente extends Conta {
/**
 * Variavel limite
 */
	private double limite;
/**
 * Metodos herdados da classe conta
 */
	@Override
	public void deposita(double valor) {
		this.setSaldo(getSaldo()+ valor);
		
	}

	@Override
	public void saca(double valor_saque) {
		this.setSaldo(getSaldo()- valor_saque);
		
	}
	
	@Override
	public double saldo() {
		return getSaldo();
	}
	/**
	 * geters e seters da variavel limite
	 * @return
	 */
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	
		
}
