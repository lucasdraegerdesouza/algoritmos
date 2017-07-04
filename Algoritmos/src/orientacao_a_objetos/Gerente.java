package orientacao_a_objetos;

public class Gerente {
		String nome;
		double salario;
				
	public void aumentasalario (){
		this.aumentasalario(10);
	}
	public void aumentasalario (double valor){
		this.salario += ((valor*salario)/100);
	}
}
