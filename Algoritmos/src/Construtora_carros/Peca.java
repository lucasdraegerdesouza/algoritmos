package Construtora_carros;

import Construtora_carros.Categoria_peca;

public class Peca {
	
	private int pec_codigo;//primary key
	private String pec_nome;
	private double pec_preco;
	private String pec_cor;
	private Categoria_peca pec_categoria;//foreign key da categoria da peça
	
	public int getPec_codigo() {
		return pec_codigo;
	}

	public void setPec_codigo(int pec_codigo) {
		this.pec_codigo = pec_codigo;
	}

	public String getPec_nome() {
		return pec_nome;
	}

	public void setPec_nome(String pec_nome) {
		this.pec_nome = pec_nome;
	}

	public double getPec_preco() {
		return pec_preco;
	}

	public void setPec_preco(double pec_preco) {
		this.pec_preco = pec_preco;
	}

	public String getPec_cor() {
		return pec_cor;
	}

	public void setPec_cor(String pec_cor) {
		this.pec_cor = pec_cor;
	}

	public Categoria_peca getPec_categoria() {
		return pec_categoria;
	}

	public void setPec_categoria(Categoria_peca pec_categoria) {
		this.pec_categoria = pec_categoria;
	}

	public static int id_peca;
	public int id = 0;
	
	public Peca (){
		
	}
	
	public Peca (Categoria_peca pec_categoria, String pec_nome, double pec_preco, String pec_cor){
		this.pec_codigo = Peca.id_peca++;
		this.pec_categoria = pec_categoria;
		this.pec_nome = pec_nome;
		this.pec_preco = pec_preco;
		this.pec_cor = pec_cor;
	}
}
	
		
		
		
		
		
		