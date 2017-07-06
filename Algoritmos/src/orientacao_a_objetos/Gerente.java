package orientacao_a_objetos;

public class Gerente {
		private String nome;
		private double salario;
				
		
	public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
	public void aumentasalario (){
		this.aumentasalario(10);
	}
	public void aumentasalario (double valor){
		this.salario += ((valor*salario)/100);
	}
}
