package Construtora_carros;



public class Categoria_peca {
	
	private int cpe_codigo; //primary key
	private String cpe_descricao;
	
	public int getCpe_codigo() {
		return cpe_codigo;
	}
	public String getCpe_descricao() {
		return cpe_descricao;
	}
	public void setCpe_descricao(String cpe_descricao) {
		this.cpe_descricao = cpe_descricao;
	}
	
	public static int codigo_cpe;
	public int id = 0;
	
	public Categoria_peca(String cpe_descricao){
		id = Categoria_peca.codigo_cpe++;
		this.cpe_codigo = id;
		this.cpe_descricao = cpe_descricao;
	}
	
	
}
