package exercicio_lista3.numero_2;

public class DVDs extends Produtos{
	
	private double duracao_dvd;

	public double getDuracao_dvd() {
		return duracao_dvd;
	}

	public void setDuracao_dvd(double duracao_dvd) {
		this.duracao_dvd = duracao_dvd;
	}
	
	public DVDs(String nome_produto, Double preco_produto, String codigo_barras, double duracao_dvd) {
		super(nome_produto, preco_produto, codigo_barras);
		this.duracao_dvd = duracao_dvd;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Duração do DVD = "+this.duracao_dvd;
	}
	
}
