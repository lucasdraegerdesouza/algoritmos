package exercicio_lista3.numero_2;

public class CDs extends Produtos{
	
	private int numero_faixas;

	public int getNumero_faixas() {
		return numero_faixas;
	}

	public void setNumero_faixas(int numero_faixas) {
		this.numero_faixas = numero_faixas;
	}
	
	public CDs(String nome_produto, Double preco_produto, String codigo_barras, int numero_faixas) {
		super(nome_produto, preco_produto, codigo_barras);
		this.numero_faixas = numero_faixas;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Numero de Faixas = "+this.numero_faixas;
	}
	
}
