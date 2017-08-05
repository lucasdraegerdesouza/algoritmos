package exercicio_lista3.numero_1;

public class Conta_corrente {
	
	
	private double limite_conta;
	private String numero_conta;
	private double saldo_conta;
	private double saque_conta;
	private double deposito_conta;
	private String agencia_conta;
	
	
	public double getLimite_conta() {
		return limite_conta;
	}
	public void setLimite_conta(double limite_conta) {
		this.limite_conta = limite_conta;
	}
	public String getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta(String numero_conta) {
		this.numero_conta = numero_conta;
	}
	public double getSaldo_conta() {
		return saldo_conta;
	}
	public void setSaldo_conta(double saldo_conta) {
		this.saldo_conta = saldo_conta;
	}
	public double getSaque_conta() {
		return saque_conta;
	}
	public void setSaque_conta(double saque_conta) {
		this.saque_conta = saque_conta + (saque_conta * (0.05d));
	}
	public double getDeposito_conta() {
		return deposito_conta;
	}
	public void setDeposito_conta(double deposito_conta) {
		this.deposito_conta = deposito_conta;
	}
	public String getAgencia_conta() {
		return agencia_conta;
	}
	public void setAgencia_conta(String agencia_conta) {
		this.agencia_conta = agencia_conta;
	}
		
		
	public Conta_corrente (){
		
	}
	

}
