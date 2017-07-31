package orientacao_a_objetos;

public class teste_contas2 {
		public static void main(String[] args) {
						
			Agencias ag = new Agencias("12345");
				
			
			
			Contas conta = new Contas(ag);
			conta.setNumero("123456");
			conta.setSaldo(1500d);
			
			Contas conta2 = new Contas(ag, "100", 2000d);
			conta2.setSaldo(1500d);
			
					
			//depositei 100 na conta
			//conta.deposita(100d);
			//System.out.println("Depositei 100, Seu Saldo "+conta.saldo);
			//saquei 50 reais
			//conta.saque(50d);
			
			//mostrei o extrato da conta
			//String extrato_conta = conta.extrato();
			//System.out.println("Saquei 50 reais");
			//System.out.println(conta.consultaSaldoDisponivel());
			//System.out.println(extrato_conta);
			
			System.out.println("Conta 1 = " +conta.getSaldo());
			System.out.println("Conta 2 = " +conta2.getSaldo());
			
			conta.transfere(conta2, 100d);
			
			System.out.println("Conta 1 = " +conta.getSaldo());
			System.out.println("Conta 2 = " +conta2.getSaldo());
			
			
		}
}
