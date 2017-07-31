package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Joaquim");
				
		Funcionario funcionario2 = new Funcionario("Maria");
		Funcionario.vale_refeicao = 15d;
		
		//funcionario.aumentarSalario(100d);
		
		System.out.println(funcionario.consultarDados());
		funcionario.reajuste_valerefeicao(10);
		System.out.println(funcionario2.consultarDados());
		
	}
}
