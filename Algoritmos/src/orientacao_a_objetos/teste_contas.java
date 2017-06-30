package orientacao_a_objetos;

import java.text.DecimalFormat;


public class teste_contas {
		public static void main(String[] args) {
			DecimalFormat df = new DecimalFormat("#0.00");
			Contas conta = new Contas();
			conta.numero = "00568-8";
			conta.saldo = 100d;
			conta.limite = 1000d;
			
			Agencias ag = new Agencias();
			ag.numero_agencia = "1";
			
			
			
			conta.agencia = ag;
			
			
			System.out.println(conta.numero);
			System.out.println (df.format(conta.saldo));
			System.out.println (df.format(conta.limite));
			conta.deposita(1000d);
			System.out.println (df.format(conta.saldo));
		}
}
