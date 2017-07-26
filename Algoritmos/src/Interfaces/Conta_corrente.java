package Interfaces;

public class Conta_corrente extends Conta {

	private double limite;
	
	
	@Override
	public void deposita(double valor) {
		this.setSaldo(getSaldo()+ valor);
		
	}

	@Override
	public void saca(double valor_saque) {
		this.setSaldo(getSaldo()- valor_saque);
		
	}
	
	@Override
	public double saldo() {
		return getSaldo();
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	
		
}
