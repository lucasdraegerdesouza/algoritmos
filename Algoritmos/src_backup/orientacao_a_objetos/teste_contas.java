package orientacao_a_objetos;

import java.text.DecimalFormat;


public class teste_contas {
		public static void main(String[] args) {
			DecimalFormat df = new DecimalFormat("#0.00");
			
			Agencias ag = new Agencias("12345");
			Contas conta = new Contas(ag, "100", 2000d);
								
			
			
			conta.setAgencia(ag);
			
			
			System.out.println(conta.getNumero());
			System.out.println (df.format(conta.getSaldo()));
			System.out.println (df.format(conta.getLimite()));
			conta.deposita(1000d);
			System.out.println (df.format(conta.getSaldo()));
		}
}
