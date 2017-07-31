/**
 * Classe responsavel pelas classes de uma conta
 */
package collectionsJava;

/**
 * Classe responsavel pela interface das contas
 * @author Lucas Draeger de Souza
 *
 */
public interface IContas {
	/**
	 * Metodo deposita responsavel por realizar o deposito de uma conta
	 * @param valor
	 */
		void deposita(double valor);
	/**
	 * Metodo saca responsavel por realizar o saque de uma conta
	 * @param valor
	 */
		void saca (double valor);
	/**
	 * Metodo saldo responsavel por pegar o saldo de uma conta
	 * @return
	 */
		double saldo();
}
