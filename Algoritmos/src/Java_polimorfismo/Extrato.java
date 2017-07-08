package Java_polimorfismo;

import java.text.SimpleDateFormat;

public class Extrato{
				
			public void geradorExtrato(Contas c){
				SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
				System.out.println("Nome = "+c.getClientes().getNome()+
				" \nData Nascimento = "+sdf.format(c.getClientes().getDtnascimento())+
				" \nCPF = "+c.getClientes().getCpf()+
				" \nAgencia = "+c.getAgencia().getAgencia()+
				" \nConta = "+c.getNumero()+
				" \nSaldo = "+c.getSaldo());
			}
			

	
}
