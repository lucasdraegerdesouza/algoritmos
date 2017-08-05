package exercicio_lista3.numero_1;

public class teste_conta_corrente {
	public static void main(String[] args) {
		
		Conta_corrente cc = new Conta_corrente();
		cc.setSaque_conta(100d);
		cc.setAgencia_conta("12345-6");
		cc.setLimite_conta(1000d);
		cc.setNumero_conta("123453-6");
		cc.setSaldo_conta(500d);
		System.out.println("Agencia = "+cc.getAgencia_conta()
		+"\nConta = "+cc.getNumero_conta()
		+"\nLimite = "
		+cc.getLimite_conta()
		+"Saque = "+cc.getSaque_conta());
	}
}
