package Java_polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlePonto {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	
	public void registraEntrada(Funcionario funcionario){
		Date agora = new Date();
		System.out.println("Entrada = "+funcionario.getNome());
		System.out.println("Data = "+sdf.format(agora));
		
	}
	
	public void registraSaida(Funcionario funcionario){
		Date agora = new Date();
		System.out.println("Saida = "+funcionario.getNome());
		System.out.println("Data = "+sdf.format(agora));
	}
}
