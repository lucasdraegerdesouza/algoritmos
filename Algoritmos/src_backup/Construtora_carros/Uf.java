package Construtora_carros;

public class Uf {
		
	private int uf_codigo;//primary key
	private String uf_nome;
	
	public int getUf_codigo() {
		return uf_codigo;
	}
	public void setUf_codigo(int uf_codigo) {
		this.uf_codigo = uf_codigo;
	}
	public String getUf_nome() {
		return uf_nome;
	}
	public void setUf_nome(String uf_nome) {
		this.uf_nome = uf_nome;
	}
	
	public static int id_uf;
	public int id = 0;
	
	public Uf(){
		
	}
	
	public Uf(String uf_nome){
		id = Uf.id_uf;
		this.uf_codigo = id;
		this.uf_nome = uf_nome;
	}
	
	
}
