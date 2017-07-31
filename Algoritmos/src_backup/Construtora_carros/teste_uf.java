package Construtora_carros;

public class teste_uf {
	public static void main(String[] args) {
		Uf uf = new Uf("SC");
		System.out.println("Codigo da Uf = "+uf.getUf_codigo());
		System.out.println("Sigla Uf = "+uf.getUf_nome());
	}
}
