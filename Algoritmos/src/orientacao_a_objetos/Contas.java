package orientacao_a_objetos;

public class Contas {
		//atributos
		String numero;
		double saldo;
		double limite = 100d;
		Agencias agencia;
		public static int contador;
		public int id = 0;
		
		public Contas(){
			contador++;
			id = contador;
		}
		//construtor = public
		public Contas(Agencias agencia) {
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
			System.out.println(contador);
			contador = 0;			
		}
		
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





