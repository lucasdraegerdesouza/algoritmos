package orientacao_a_objetos;

public class teste_contas2 {
		public static void main(String[] args) {
						
			Contas conta = new Contas();
			conta.numero = "00568-8";
			conta.saldo = 100d;
			conta.limite = 2000d;
			
			Agencias ag = new Agencias();
			ag.numero_agencia = "1";
			
			conta.agencia = ag;
			
			System.out.println("Seu Saldo "+conta.saldo);
			
			//depositei 100 na conta
			conta.deposita(100d);
			System.out.println("Depositei 100, Seu Saldo "+conta.saldo);
			//saquei 50 reais
			conta.saque(50d);
			
			//mostrei o extrato da conta
			String extrato_conta = conta.extrato();
			System.out.println("Saquei 50 reais");
			System.out.println(conta.consultaSaldoDisponivel());
			System.out.println(extrato_conta);
			
		}
}
