package Construtora_carros;

public class teste_categoria_peca {
	public static void main(String[] args) {
		
		
		Categoria_peca cpe = new Categoria_peca("Cambio");
		System.out.println("Codigo da Pe�a = "+cpe.getCpe_codigo()+"\nDescri��o da Pe�a = "+cpe.getCpe_descricao());
		
		Categoria_peca cpe2 = new Categoria_peca("Graxa");
		System.out.println("Codigo da Pe�a = "+cpe2.getCpe_codigo()+"\nDescri��o da Pe�a = "+cpe2.getCpe_descricao());
	}
}
