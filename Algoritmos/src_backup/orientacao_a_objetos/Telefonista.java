package orientacao_a_objetos;
import orientacao_a_objetos.Funcionario;

public class Telefonista extends Funcionario{
	
	private int codigo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Telefonista(int codigo){
		this.codigo = codigo;
	}
	
	@Override
	public String consultarDados2() {
		return super.consultarDados2()+" Codigo = "+ this.codigo;
	}
	
}
