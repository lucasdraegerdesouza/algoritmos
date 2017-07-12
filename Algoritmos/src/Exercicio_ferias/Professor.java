package Exercicio_ferias;

import Exercicio_ferias.Pessoa;

public class Professor extends Pessoa{
	
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Professor(){
		
	}
	
	public Professor(String login, String senha){
		this.login = login;
		this.senha = senha;
	}
}
