package orientacao_a_objetos;

import java.text.DecimalFormat;


public class teste_contas {
		public static void main(String[] args) {
			DecimalFormat df = new DecimalFormat("#0.00");
			
			Agencias ag = new Agencias("12345");
			Contas conta = new Contas(ag, "100", 2000d);
								
			
			
			conta.agencia = ag;
			
			
			System.out.println(conta.numero);
			System.out.println (df.format(conta.saldo));
			System.out.println (df.format(conta.limite));
			conta.deposita(1000d);
			System.out.println (df.format(conta.saldo));
		}
}
