package Banda;

public class Gravadora {

	
	private int gra_codigo;//primary key
	private String gra_nome;
	private int gra_pais;//foreign key da pai_codigo;
	
	public int getGra_codigo() {
		return gra_codigo;
	}
	public void setGra_codigo(int gra_codigo) {
		this.gra_codigo = gra_codigo;
	}
	public String getGra_nome() {
		return gra_nome;
	}
	public void setGra_nome(String gra_nome) {
		this.gra_nome = gra_nome;
	}
	public int getGra_pais() {
		return gra_pais;
	}
	public void setGra_pais(int gra_pais) {
		this.gra_pais = gra_pais;
	}
	
	
}
