package orientacao_a_objetos;

public class Teste_cliente {
	public static void main(String[] args) {
		Cliente clientes = new Cliente();
		clientes.setCodigo_cliente(1000);
		clientes.setNome_cliente("Lucas");
		System.out.println(clientes.getCodigo_cliente());
		System.out.println(clientes.getNome_cliente());

	}
}
