package Construtora_carros;

public class Fornece_para {

	
	private int fpa_peca;//primary key e foreign key do pec_codigo;
	private int fpa_fornercedor;//primary key e foreign key do for_codigo;
	private int fpa_projeto;//primary key e foreign key do pro_codigo;
	private int fpa_qtd;
	
	public int getFpa_peca() {
		return fpa_peca;
	}
	public void setFpa_peca(int fpa_peca) {
		this.fpa_peca = fpa_peca;
	}
	public int getFpa_fornercedor() {
		return fpa_fornercedor;
	}
	public void setFpa_fornercedor(int fpa_fornercedor) {
		this.fpa_fornercedor = fpa_fornercedor;
	}
	public int getFpa_projeto() {
		return fpa_projeto;
	}
	public void setFpa_projeto(int fpa_projeto) {
		this.fpa_projeto = fpa_projeto;
	}
	public int getFpa_qtd() {
		return fpa_qtd;
	}
	public void setFpa_qtd(int fpa_qtd) {
		this.fpa_qtd = fpa_qtd;
	}
	
	
}
