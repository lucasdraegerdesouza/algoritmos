package Exercicio_ferias;

public class Teste_Aluno_Professor {
	public static void main(String[] args) {
	
		Aluno al = new Aluno("aluno_lucas", "12345lucas");
		al.setNome("Lucas Draeger de Souza");
		al.setIdade(22);
		al.setEndereco("Rua Carl Muller");
		
		Professor pf = new Professor("professor_stefanie", "12345stefanie");
		pf.setNome("Stefanie");
		pf.setIdade(26);
		pf.setEndereco("Rua Carl Muller");
		
		System.out.println("Nome Aluno = "+al.getNome()+
		"\nIdade = "+al.getIdade()+
		"\nEndereço = "+al.getEndereco()+
		"\nLogin = "+al.getLogin()+
		"\nSenha = "+al.getSenha());
		System.out.println("-------------------------------");
		System.out.println("Nome Professora = "+pf.getNome()+
		"\nIdade = "+pf.getIdade()+
		"\nEndereço = "+pf.getEndereco()+
		"\nLogin = "+pf.getLogin()+
		"\nSenha ="+pf.getSenha());
		
	}
}
