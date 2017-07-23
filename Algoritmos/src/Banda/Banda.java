package Banda;

import java.sql.Date;

public class Banda {

	
	private int ban_codigo;//primary key
	private String ban_nome;
	private Date ban_dt_criacao;
	private int ban_pais;//foreign key do pai_codigo
	
	public int getBan_codigo() {
		return ban_codigo;
	}
	public void setBan_codigo(int ban_codigo) {
		this.ban_codigo = ban_codigo;
	}
	public String getBan_nome() {
		return ban_nome;
	}
	public void setBan_nome(String ban_nome) {
		this.ban_nome = ban_nome;
	}
	public Date getBan_dt_criacao() {
		return ban_dt_criacao;
	}
	public void setBan_dt_criacao(Date ban_dt_criacao) {
		this.ban_dt_criacao = ban_dt_criacao;
	}
	public int getBan_pais() {
		return ban_pais;
	}
	public void setBan_pais(int ban_pais) {
		this.ban_pais = ban_pais;
	}
	
	
}
