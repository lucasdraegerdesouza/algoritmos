package Construtora_carros;

public class Cidade_fornercedor {
		
	private int cif_cidade;//primary key e foreign key da cid_codigo;
	private int cif_fornecedor;//priamry key e foreign key do for_codigo;
	
	public int getCif_cidade() {
		return cif_cidade;
	}
	public void setCif_cidade(int cif_cidade) {
		this.cif_cidade = cif_cidade;
	}
	public int getCif_fornecedor() {
		return cif_fornecedor;
	}
	public void setCif_fornecedor(int cif_fornecedor) {
		this.cif_fornecedor = cif_fornecedor;
	}
	
	
}
