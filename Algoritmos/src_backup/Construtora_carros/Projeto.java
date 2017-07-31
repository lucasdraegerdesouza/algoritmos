package Construtora_carros;

public class Projeto {

	
	private int pro_codigo;//primary key
	private String pro_nome;
	private double pro_custo;
	private int pro_categoria;//foreign key do cap_codigo;
	
	public int getPro_codigo() {
		return pro_codigo;
	}
	public void setPro_codigo(int pro_codigo) {
		this.pro_codigo = pro_codigo;
	}
	public String getPro_nome() {
		return pro_nome;
	}
	public void setPro_nome(String pro_nome) {
		this.pro_nome = pro_nome;
	}
	public double getPro_custo() {
		return pro_custo;
	}
	public void setPro_custo(double pro_custo) {
		this.pro_custo = pro_custo;
	}
	public int getPro_categoria() {
		return pro_categoria;
	}
	public void setPro_categoria(int pro_categoria) {
		this.pro_categoria = pro_categoria;
	}
	
	
}
