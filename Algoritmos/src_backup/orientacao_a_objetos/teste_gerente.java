package orientacao_a_objetos;

public class teste_gerente {
		public static void main(String[] args) {
			Gerente gerente = new Gerente();
			gerente.setNome("Lucas");
			gerente.setSalario(4000d);
			gerente.aumentasalario();
			
			System.out.println("Aumento o salario " + gerente.getSalario());
			
			gerente.setNome("Lucas Draeger");
			gerente.setSalario(4000d);
			gerente.aumentasalario(50);
			
			System.out.println("Aumento o salario " + gerente.getSalario());
			
		}
}
