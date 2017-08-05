package exercicio_lista3.numero_2;

public class Livros extends Produtos{
	
	private String autor_livro;
	
	
	public String getAutor_livro() {
		return autor_livro;
	}

	public void setAutor_livro(String autor_livro) {
		this.autor_livro = autor_livro;
	}
	
	public Livros(String nome_produto, Double preco_produto, String codigo_barras, String autor_livro) {
		super(nome_produto, preco_produto, codigo_barras);
		this.autor_livro = autor_livro;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Autor = "+this.autor_livro;
	}
}
