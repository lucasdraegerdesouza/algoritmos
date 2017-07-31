package orientacao_a_objetos;
import orientacao_a_objetos.Funcionario;

public class Secretarias extends Funcionario{
	
	private int ramal;
	
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public Secretarias(int ramal){
		this.ramal = ramal;
	}
	
	@Override
	public String consultarDados2() {
		return super.consultarDados2()+" Ramal = "+this.ramal;
	}
	
}
