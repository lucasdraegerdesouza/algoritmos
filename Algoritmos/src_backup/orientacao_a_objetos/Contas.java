
package orientacao_a_objetos;

public class Contas {
	//atributos de instancia
		private String numero;
		private double saldo;
		private double limite = 100d;
		private Agencias agencia;
		
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public double getLimite() {
			return limite;
		}
		public void setLimite(double limite) {
			this.limite = limite;
		}
		public Agencias getAgencia() {
			return agencia;
		}
		public void setAgencia(Agencias agencia) {
			this.agencia = agencia;
		}

		//atributos da classe
		public static int contador;
		public int id = 0;
		
		public Contas(){
			Contas.contador++;
			id = Contas.contador;
		}
		//construtor = public
		public Contas(Agencias agencia) {
			this();
			this.agencia = agencia;
		}
		
		public Contas(Agencias agencia, String numero, double limite){
			this(agencia);
			this.numero = numero;
			this.limite = limite;
		}
		
		//metodo = public void
		public void transfere(Contas destino, double valor){
			this.saldo -= valor;
			destino.saldo += valor;
		}
		
		public static void zeraContador(){
			//System.out.println(Contas.contador);
			Contas.contador = 0;			
		}
		
		public void deposita(double valor){
			this.saldo += valor;
		}
		
		public void saque(double valor_saque){
			this.saldo -= valor_saque;
		}
		
		public String extrato(){
			return "Agencia " + this.getAgencia().getNumero_agencia() + " Conta " + 
		this.numero + " Limite da Conta "+this.limite + " Saldo da Conta "+this.saldo;
			
		}
		
		public double consultaSaldoDisponivel(){
			return this.saldo + this.limite;
		}
}





