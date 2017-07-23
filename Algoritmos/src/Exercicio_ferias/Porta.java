package Exercicio_ferias;

public class Porta {
	
	private int aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	public int getAberta() {
		return aberta;
	}

	public void setAberta(int aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public void abre(){
		this.aberta = 1;
	}
	
	public void fecha(){
		this.aberta = 2;
	}

	public void pinta(String s){
		this.cor = s;
	}
	
	public void booleanestaAberta(){
		
	}
}
