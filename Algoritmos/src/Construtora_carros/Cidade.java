package Construtora_carros;

public class Cidade {

	private int cid_codigo;//primary key
	private String cid_nome;
	private int cid_uf;//foreign key do uf_codigo
	public int getCid_codigo() {
		return cid_codigo;
	}
	public void setCid_codigo(int cid_codigo) {
		this.cid_codigo = cid_codigo;
	}
	public String getCid_nome() {
		return cid_nome;
	}
	public void setCid_nome(String cid_nome) {
		this.cid_nome = cid_nome;
	}
	public int getCid_uf() {
		return cid_uf;
	}
	public void setCid_uf(int cid_uf) {
		this.cid_uf = cid_uf;
	}
	
}
