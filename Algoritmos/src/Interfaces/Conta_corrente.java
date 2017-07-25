package Interfaces;

public class Conta_corrente implements Contas{

	private double saldo;

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void saca(double valor_saque) {
		this.saldo -= valor_saque;
		
	}

}
