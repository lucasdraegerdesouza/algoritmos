package Banda;

public class Musica {
	
	
	private int mus_codigo;//primary key;
	private String mus_nome;
	private double mus_duracao;
	
	public int getMus_codigo() {
		return mus_codigo;
	}
	public void setMus_codigo(int mus_codigo) {
		this.mus_codigo = mus_codigo;
	}
	public String getMus_nome() {
		return mus_nome;
	}
	public void setMus_nome(String mus_nome) {
		this.mus_nome = mus_nome;
	}
	public double getMus_duracao() {
		return mus_duracao;
	}
	public void setMus_duracao(double mus_duracao) {
		this.mus_duracao = mus_duracao;
	}
	
	
}
