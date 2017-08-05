package exercicio_lista3.numero_2;

public abstract class Produtos {
	
	private String nome_produto;
	private Double preco_produto;
	private String codigo_barras;
	
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public Double getPreco_produto() {
		return preco_produto;
	}
	public void setPreco_produto(Double preco_produto) {
		this.preco_produto = preco_produto;
	}
	public String getCodigo_barras() {
		return codigo_barras;
	}
	public void setCodigo_barras(String codigo_barras) {
		this.codigo_barras = codigo_barras;
	}
	
	public Produtos (String nome_produto, Double preco_produto, String codigo_barras){
		this.nome_produto = nome_produto;
		this.preco_produto = preco_produto;
		this.codigo_barras = codigo_barras;
	}
	
	@Override
	public String toString() {
		return "Nome = "+this.nome_produto+" Preço = "+this.preco_produto;
	}
}
