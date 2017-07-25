package Construtora_carros;

public class Cidade {

	private int cid_codigo;//primary key
	private String cid_nome;
	private Uf cid_uf;//foreign key do uf_codigo
	
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
	public Uf getCid_uf() {
		return cid_uf;
	}
	public void setCid_uf(Uf cid_uf) {
		this.cid_uf = cid_uf;
	}
	
	public static int id_cidade;
	public int id = 0;
	
	public Cidade(){
	
	}
	
	public Cidade(String cid_nome, Uf cid_uf){
		this.cid_codigo = Uf.id_uf++;
		this.cid_nome = cid_nome;
		this.cid_uf = cid_uf;
	}
	
}
