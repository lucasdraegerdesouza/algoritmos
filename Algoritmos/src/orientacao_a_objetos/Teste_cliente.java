package orientacao_a_objetos;

public class Teste_cliente {
	public static void main(String[] args) {
		Cliente clientes = new Cliente();
		clientes.codigo_cliente = 1000;
		clientes.nome_cliente = "Lucas";
		System.out.println(clientes.codigo_cliente);
		System.out.println(clientes.nome_cliente);

	}
}
