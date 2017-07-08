package Java_polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_extrato {
		public static void main(String[] args) throws ParseException {
			SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy"); 
			
			Agencia ag = new Agencia();
			ag.setAgencia("12345");
			
			Clientes cli = new Clientes();
			cli.setNome("Lucas");
			cli.setDtnascimento(sdf.parse("27/01/1995"));
			cli.setCpf("079.120.719-62");
			
			//exemplo de poliformismo, funciona com Contas ou Conta_corrente \/
			Conta_corrente con = new Conta_corrente();
			con.setAgencia(ag);
			con.setClientes(cli);
			con.setNumero("890");
			con.setSaldo(2000d);
			
			Extrato ex = new Extrato();
			ex.geradorExtrato(con);
		}
}
