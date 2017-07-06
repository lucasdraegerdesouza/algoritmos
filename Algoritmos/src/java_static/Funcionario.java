package java_static;

import java.text.DecimalFormat;

public class Funcionario {

	DecimalFormat df = new DecimalFormat("#0.00");
	//atributos de instancia
	private String nome;
	private double salario;
	//atributos da classe
	static double vale_refeicao;
	
	
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

	//contador
	public Funcionario(String nome){
		this.nome = nome;
		this.salario = 1000d;
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
	
	public String consultarDados(){
		return "Nome: "+this.nome+
				"\nSalário: R$"+df.format(this.salario) + " Vale Refeição = "+(this.vale_refeicao);
	}
}
