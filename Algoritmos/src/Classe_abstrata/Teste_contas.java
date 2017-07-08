package Classe_abstrata;

public class Teste_contas {
	public static void main(String[] args) {
		Contas c = new Contas();
		c.setAgencia("1234");
		c.setNumero("156");
		c.setSaldo(10000d);
		System.out.println("Agencia = "+c.getAgencia()+
				" \nConta numero = "+c.getNumero()+
				" \nSaldo = "+c.getSaldo());
	}
	
}
