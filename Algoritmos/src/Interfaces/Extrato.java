package Interfaces;

public class Extrato {
	
	public static void geradorExtrato(IContas c){
		System.out.println("Saldo da Conta = "+c.saldo());
	}
}
