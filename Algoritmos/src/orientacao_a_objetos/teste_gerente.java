package orientacao_a_objetos;

public class teste_gerente {
		public static void main(String[] args) {
			Gerente gerente = new Gerente();
			gerente.nome = "Lucas";
			gerente.salario = 4000d;
			gerente.aumentasalario();
			
			System.out.println("Aumento o salario " + gerente.salario);
			
			gerente.nome = "Lucas Draeger";
			gerente.salario = 4000d;
			gerente.aumentasalario(50);
			
			System.out.println("Aumento o salario " + gerente.salario);
			
		}
}
