package Construtora_carros;

public class Fornecedor {

	
	private int for_codigo;//primary key
	private String for_nome;
	private int for_categoria;//foreign key da caf_codigo categoria do fornecedor
	public int getFor_codigo() {
		return for_codigo;
	}
	public void setFor_codigo(int for_codigo) {
		this.for_codigo = for_codigo;
	}
	public String getFor_nome() {
		return for_nome;
	}
	public void setFor_nome(String for_nome) {
		this.for_nome = for_nome;
	}
	public int getFor_categoria() {
		return for_categoria;
	}
	public void setFor_categoria(int for_categoria) {
		this.for_categoria = for_categoria;
	}
	
	
}
