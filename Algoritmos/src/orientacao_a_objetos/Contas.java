package orientacao_a_objetos;

public class Contas {
		String numero;
		double saldo;
		double limite = 100d;
		Agencias agencia;
		
		public void deposita(double valor){
			this.saldo += valor;
		}
		
		public void saque(double valor_saque){
			this.saldo -= valor_saque;
		}
		
		public String extrato(){
			return "Agencia " + this.agencia.numero_agencia + " Conta " + 
		this.numero + " Limite da Conta "+this.limite + " Saldo da Conta "+this.saldo;
			
		}
		
		public double consultaSaldoDisponivel(){
			return this.saldo + this.limite;
		}
}





