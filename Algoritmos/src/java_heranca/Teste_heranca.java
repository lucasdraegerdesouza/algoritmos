package java_heranca;

import orientacao_a_objetos.Gerente;
import orientacao_a_objetos.Secretarias;
import orientacao_a_objetos.Telefonista;

public class Teste_heranca {
	public static void main(String[] args) {
			
		Gerente gr = new Gerente("Souza", "1234");
		gr.setNome("Stefanie");
		gr.setSalario(2000d);
		gr.bonificacaoSalario();
		
		Telefonista tf = new Telefonista(1);			
		tf.setNome("Lucas");
		tf.setSalario(2000d);
		tf.bonificacaoSalario();
		
		Secretarias sr = new Secretarias(12);
		sr.setNome("Aurea");
		sr.setSalario(2000d);
		sr.bonificacaoSalario();
		
		System.out.println("Gerente = "+ gr.getNome() +" Seu Login "+gr.getLogin()+" Sua Senha = "+gr.getSenha()+ " Salario = "+gr.getSalario()+" Bonificação = "+gr.getBonificacao());
		System.out.println(gr.consultarDados2());
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("Telefonista = "+ tf.getNome() + " Seu Codigo = "+tf.getCodigo()+" Salario = "+tf.getSalario()+" Bonificação = "+tf.getBonificacao());
		System.out.println(tf.consultarDados2());
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("Secretaria = "+ sr.getNome() + " Seu Ramal = "+sr.getRamal()+" Salario = "+sr.getSalario()+" Bonificação = "+sr.getBonificacao());
		System.out.println(sr.consultarDados2());
	
		}
	}

