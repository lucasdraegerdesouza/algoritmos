package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) throws Exception {
		Funcionario funcionario = new Funcionario("Joaquim");
				
		Funcionario funcionario2 = new Funcionario("Maria");
		Funcionario.vale_refeicao = 15d;
		
		try {
			funcionario.aumentarSalario(-1d);
		} catch (IllegalArgumentException erro) {
			System.out.println("Houve um erro ao depositar");
		}
		
		System.out.println(funcionario.consultarDados());
		funcionario.reajuste_valerefeicao(10);
		System.out.println(funcionario2.consultarDados());
		
	}
}
