package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class teste_cartao_credito {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Cartao_credito cdc = new Cartao_credito();
		cdc.setCard_credito_numero(123465789);
		cdc.setCard_credito_validade(sdf.parse("01/01/2019"));
		
		Cliente c = new Cliente();
		c.setCodigo_cliente(1);
		c.setNome_cliente("Lucas");
		
		
		cdc.setCliente(c);
				
		System.out.println(cdc.getCliente().getCodigo_cliente());
		System.out.println(cdc.getCliente().getNome_cliente());
		System.out.println(cdc.getCard_credito_numero());
		System.out.println(sdf.format(cdc.getCard_credito_validade()));
			
	}
}
