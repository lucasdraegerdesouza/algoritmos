package Java_polimorfismo;

public class Conta_poupanca extends Contas{
		private double taxa;

		public double getTaxa() {
			return taxa;
		}

		public void setTaxa(double taxa) {
			this.taxa = taxa;
		}
		
		public Conta_poupanca(){
			
		}

		public Conta_poupanca(double taxa) {
			super();
			this.taxa = taxa;
		}
		
		
}
