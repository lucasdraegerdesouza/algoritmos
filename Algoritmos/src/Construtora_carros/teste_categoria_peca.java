package Construtora_carros;

public class teste_categoria_peca {
	public static void main(String[] args) {
		
		
		Categoria_peca cpe = new Categoria_peca("teste");
		System.out.println("Codigo da Peça = "+cpe.getCpe_codigo()+"\nDescrição da Peça = "+cpe.getCpe_descricao());
	}
}
