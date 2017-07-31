/**
 * Classe responsavel pelas classes de uma conta
 */
package collectionsJava;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel pelo teste da interface e das contas
 * @author Noturno
 *
 */
public class teste_contas {
	public static void main(String[] args) {
		List conta_corrente = new ArrayList();
		List conta_poupanca = new ArrayList();
		
		Conta_corrente c1 = new Conta_corrente();
		conta_corrente.add(c1);
		Conta_corrente c2 = new Conta_corrente();
		conta_corrente.add(c2);
		Conta_corrente c3 = new Conta_corrente();
		conta_corrente.add(c3);
		Conta_corrente c4 = new Conta_corrente();
		conta_corrente.add(c4);
		Conta_corrente c5 = new Conta_corrente();
		conta_corrente.add(c5);
		
		Conta_poupanca cp1 = new Conta_poupanca();
		conta_poupanca.add(cp1);
		Conta_poupanca cp2 = new Conta_poupanca();
		conta_poupanca.add(cp2);
		Conta_poupanca cp3 = new Conta_poupanca();
		conta_poupanca.add(cp3);
		Conta_poupanca cp4 = new Conta_poupanca();
		conta_poupanca.add(cp4);
		Conta_poupanca cp5 = new Conta_poupanca();
		conta_poupanca.add(cp5);
		
		System.out.println("Tamanho da lista de contas correntes = "+conta_corrente.size());
		System.out.println("Tamanho da lista de contas poupanças = "+conta_poupanca.size());
		
		System.out.println("Removi um objeto da conta corrente através do objeto");
		conta_corrente.remove(c1);
		
		System.out.println("\nTamanho da lista de contas correntes = "+conta_corrente.size());
		System.out.println("Tamanho da lista de contas poupanças = "+conta_poupanca.size());
		
		System.out.println("removi um objeto da conta poupança atraves do seu indice");
		conta_poupanca.remove(3);
		
		System.out.println("Tamanho da lista de contas correntes = "+conta_corrente.size());
		System.out.println("Tamanho da lista de contas poupanças = "+conta_poupanca.size());
		
		for (Object objectCC : conta_corrente) {
			System.out.println("\n"+objectCC);
		}
		
		for (Object objectCP : conta_poupanca) {
			System.out.println("\n"+objectCP);
		}
		
		System.out.println("\nRemovi todos os itens das 2 listas");
		conta_corrente.clear();
		conta_poupanca.clear();
		
		System.out.println("Tamanho da lista de contas correntes = "+conta_corrente.size());
		System.out.println("Tamanho da lista de contas poupanças = "+conta_poupanca.size());
	}
}
