package Construtora_carros;

public class teste_cidade {
	public static void main(String[] args) {
		
		Uf uf = new Uf("SC");
		
		
		Cidade cid = new Cidade("Blumenau", uf);
		System.out.println("Codigo da Cidade = "+cid.getCid_codigo());
		System.out.println("Nome da Cidade = "+cid.getCid_nome());
		System.out.println("Nome da Uf = "+cid.getCid_uf().getUf_nome());
		System.out.println("Codigo da Uf = "+cid.getCid_uf().getUf_codigo());
		
		System.out.println("\n");
		
		Uf uf2 = new Uf("PR");
		Cidade cid2 = new Cidade("Curitiba", uf2);
		System.out.println("Codigo da Cidade = "+cid2.getCid_codigo());
		System.out.println("Nome da Cidade = "+cid2.getCid_nome());
		System.out.println("Nome da Uf = "+cid2.getCid_uf().getUf_nome());
		System.out.println("Codigo da Uf = "+cid2.getCid_uf().getUf_codigo());
	}
}
