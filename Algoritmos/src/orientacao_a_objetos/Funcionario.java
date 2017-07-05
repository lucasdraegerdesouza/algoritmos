package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Funcionario {

	DecimalFormat df = new DecimalFormat("#0.00");
	//atributos
	String nome;
	double salario;
	static double vale_refeicao;
	
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
		Funcionario.vale_refeicao += Funcionario.vale_refeicao * taxa;
	}
	public void aumentarSalario(double valor){
		this.salario += valor;
	}
	
	public String consultarDados(){
		return "Nome: "+this.nome+
				"\nSalário: R$"+df.format(this.salario) + " Vale Refeição = "+(this.vale_refeicao);
	}
}
