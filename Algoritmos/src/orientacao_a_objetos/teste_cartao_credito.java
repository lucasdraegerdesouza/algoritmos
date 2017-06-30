package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class teste_cartao_credito {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Cartao_credito cdc = new Cartao_credito();
		cdc.card_credito_numero = 123465789;
		cdc.card_credito_validade = sdf.parse("01/01/2019");
		
		Cliente c = new Cliente();
		cdc.cliente.codigo_cliente = 1;
		cdc.cliente.nome_cliente = "Lucas";
		
		cdc.cliente = c;
				
		System.out.println(cdc.cliente.codigo_cliente);
		System.out.println(cdc.cliente.nome_cliente);
		System.out.println(cdc.card_credito_numero);
		System.out.println(sdf.format(cdc.card_credito_validade));
			
	}
}
