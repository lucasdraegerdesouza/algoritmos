package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Funcionario {

	DecimalFormat df = new DecimalFormat("#0.00");
	//atributos de instancia
	private String nome;
	private double salario;
	private double bonificacao;
	
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
	
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}



	//atributos da classe
	static double vale_refeicao;
	
	//contador
	public Funcionario(String nome){
		this.nome = nome;
		this.salario = 1000d;
	}
	
	public Funcionario(){
		
	}
	
	public Funcionario(String nome, double salario) {
		this(nome);
		this.salario = salario;
	}
	
	
	//metodo = public void
	public void reajuste_valerefeicao(double taxa){
		Funcionario.vale_refeicao += Funcionario.vale_refeicao * taxa/100;
	}
	public void aumentarSalario(double valor){
		this.salario += valor;
	}
	
	//public void bonificacaoSalario(double bonus){
	//	this.bonificacao = (this.salario*(bonus/100d));
	//}
	
	public void bonificacaoSalario(){
			this.bonificacao = (this.salario*(10d/100));
		}
	
	
	public void aumentasalario (){
		this.aumentasalario(10);
	}
	
	public void aumentasalario (double valor){
		this.salario += ((valor*salario)/100);
	}
	
	public String consultarDados(){
		return "Nome: "+this.nome+
				"\nSalário: R$"+df.format(this.salario) + " Vale Refeição = "+(this.vale_refeicao);
	}
	
	public String consultarDados2(){
		return "Nome = "+this.nome+" Salario = "+this.salario+" Bonificação = "+this.bonificacao;
	}
}
