package Construtora_carros;

public class teste_peca {
	
	public static void main(String[] args) {
		
		Categoria_peca pec_categoria = new Categoria_peca("Cambio");
		Categoria_peca pec_categoria2 = new Categoria_peca("Graxa");
		
		Peca pc = new Peca(pec_categoria, "Mola", 10d, "Vermelha");
		System.out.println("Codigo = "+pc.getPec_codigo());
		System.out.println("Nome = "+pc.getPec_nome());
		System.out.println("Pre�o = "+pc.getPec_preco());
		System.out.println("Cor da Pe�a = "+pc.getPec_cor());
		System.out.println("Codigo da categoria da pe�a = "+pc.getPec_categoria().getCpe_codigo());
		System.out.println(pc.getPec_categoria().getCpe_descricao());
		
		System.out.println("\n");
		
		Peca pc2 = new Peca(pec_categoria2, "Correia", 100d, "Verde");
		System.out.println("Codigo = "+pc2.getPec_codigo());
		System.out.println("Nome = "+pc2.getPec_nome());
		System.out.println("Pre�o = "+pc2.getPec_preco());
		System.out.println("Cor da Pe�a = "+pc2.getPec_cor());
		System.out.println("Codigo da categoria da pe�a = "+pc2.getPec_categoria().getCpe_codigo());
		System.out.println(pc2.getPec_categoria().getCpe_descricao());
	}
}
