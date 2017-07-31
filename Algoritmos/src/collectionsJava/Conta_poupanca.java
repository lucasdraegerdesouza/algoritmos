/**
 * Classe responsavel pelas classes de uma conta
 */
package collectionsJava;
/**
 * Classe responsavel por uma conta poupança que herda os atributos de conta
 * @author Lucas Draeger de Souza
 *
 */
public class Conta_poupanca extends Conta{
/**
 * Metodos herdados da classe conta
 */
	@Override
	public void deposita(double valor) {
		this.setSaldo(getSaldo()+ valor);
		
	}

	@Override
	public void saca(double valor) {
		this.setSaldo(getSaldo()- valor);
		
	}

	@Override
	public double saldo() {
		return getSaldo();
	}
	
}
