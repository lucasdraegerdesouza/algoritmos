package Exercicio_ferias;

public class Teste_enumeracao {
	public static void main(String[] args) {
		
		for(Enumeracao_exemplo ene : Enumeracao_exemplo.values()){
			System.out.println(ene+ene.getNome()+ " Idade = "+ ene.getIdade());
		}
	}
}

