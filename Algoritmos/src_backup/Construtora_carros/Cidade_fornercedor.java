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
	
	public Cidade_fornercedor(){
		
	}
	
	public Cidade_fornercedor(Cidade cif_cidade, Fornecedor cif_fornecedor){
		this.cif_cidade = Cidade.id_cidade++;
		//this.cif_fornecedor = Fornecedor.id_fornecedor++;
		//vai receber a primary key da cidade e do fornecedor
		
	}
	}

