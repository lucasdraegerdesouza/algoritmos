package Construtora_carros;

public class teste_peca {
	
	public static void main(String[] args) {
		
		Peca pc = new Peca("Pe�a teste", 100d, "Vermelha");
		pc.setPec_nome("Teste");
		pc.setPec_preco(100d);
		pc.setPec_cor("Vermelha");
		System.out.println("Codigo = "+pc.getPec_codigo());
		System.out.println("Nome = "+pc.getPec_nome());
		System.out.println("Pre�o = "+pc.getPec_preco());
		System.out.println("Codigo da categoria da pe�a = "+pc.getPec_categoria());
		System.out.println("\n");
		
		Peca pc2 = new Peca("Pe�a teste", 100d, "Vermelha0");
		System.out.println("Codigo = "+pc2.getPec_codigo());
		System.out.println("Nome = "+pc2.getPec_nome());
		System.out.println("Pre�o = "+pc2.getPec_preco());
		System.out.println("Codigo da categoria da pe�a = "+pc2.getPec_categoria());
		
	}
}
