/**
 * Classe responsavel pelas classes de uma conta
 */
package Interfaces;

/**
 * Classe responsavel pelo teste da interface e das contas
 * @author Noturno
 *
 */
public class teste_contas {
	public static void main(String[] args) {
		
		Conta_corrente c = new Conta_corrente();
		c.setAgencia("1");
		c.setSaldo(1000d);
		c.setLimite(2000d);
		c.setNumero("890-0");
		System.out.println("Conta = "+c.getNumero()+
		"\nAgencia = "+c.getAgencia()+
		"\nSaldo = "+c.getSaldo()+
		"\nLimite = "+c.getLimite()+
		"\nNumero da Conta = "+c.getNumero());
		c.deposita(100d);
		System.out.println("Depositei 100 reais = "+c.getSaldo());
		c.saca(100d);
		System.out.println("Saquei 100 reais = "+c.getSaldo());
		Extrato.geradorExtrato(c);
		
	}
}
