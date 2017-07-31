package Construtora_carros;

public class teste_categoria_peca {
	public static void main(String[] args) {
		
		
		Categoria_peca cpe = new Categoria_peca("Cambio");
		System.out.println("Codigo da Peça = "+cpe.getCpe_codigo()+"\nDescrição da Peça = "+cpe.getCpe_descricao());
		
		Categoria_peca cpe2 = new Categoria_peca("Graxa");
		System.out.println("Codigo da Peça = "+cpe2.getCpe_codigo()+"\nDescrição da Peça = "+cpe2.getCpe_descricao());
	}
}
