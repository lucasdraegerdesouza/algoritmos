package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Funcionario {

	DecimalFormat df = new DecimalFormat("#0.00");
	
	String nome;
	double salario = 1000d;
	
	public Funcionario(String nome){
		this.nome = nome;
	}
	
	public Funcionario(String nome, double salario) {
		this(nome);
		this.salario = salario;
	}

	public void aumentarSalario(double valor){
		this.salario += valor;
	}
	
	public String consultarDados(){
		return "Nome: "+this.nome+
				"\nSalário: R$"+df.format(this.salario);
	}
}
