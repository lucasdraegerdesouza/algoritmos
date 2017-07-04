package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Joaquim");
				
		Funcionario funcionario2 = new Funcionario("Maria", 1800d);
				
		//funcionario.aumentarSalario(100d);
		
		System.out.println(funcionario.consultarDados());
		System.out.println(funcionario2.consultarDados());
	}
}
