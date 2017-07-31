package Exercicio_ferias;

public class Exercicio_9 {
	
	private String nome_pais;
	private String pais_capital;
	private Double dimencao;
	
	public String getNome_pais() {
		return nome_pais;
	}
	public void setNome_pais(String nome_pais) {
		this.nome_pais = nome_pais;
	}
	public String getPais_capital() {
		return pais_capital;
	}
	public void setPais_capital(String pais_capital) {
		this.pais_capital = pais_capital;
	}
	public Double getDimencao() {
		return dimencao;
	}
	public void setDimencao(Double dimencao) {
		this.dimencao = dimencao;
	}
	
	public Exercicio_9(String nome_pais, String pais_capital, Double dimencao){
		this.nome_pais = nome_pais;
		this.pais_capital = pais_capital;
		this.dimencao = dimencao;
	}
}
