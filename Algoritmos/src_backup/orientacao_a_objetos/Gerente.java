package orientacao_a_objetos;
import orientacao_a_objetos.Funcionario;

public class Gerente extends Funcionario{
		
		private String senha;
		private String login;
				
		
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		
		public Gerente(){
			
		}
		
		public Gerente(String login, String senha){
			this.login = login;
			this.senha = senha;
		}
		
		@Override
		public void bonificacaoSalario(){
			setBonificacao(getSalario()*(15/100d));
			
		}
		
		@Override
		public String consultarDados2() {
		return super.consultarDados2()+" Login = "+this.login+" Senha = "+this.senha;
		}
		
}
