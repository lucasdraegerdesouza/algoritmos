package Exercicio_ferias;

public enum Enumeracao_exemplo {
	/*propio java cria uma array quando se trata de enumeração*/
	pessoa1(" Lucas", 20),
	pessoa2(" Stefanie", 28),
	pessoa3(" Celso", 50),
	pessoa4(" Aurea", 70);
	
	/*impede que não consiga ser alterado o valor*/
	private final String nome;
	private final int idade;
	
	Enumeracao_exemplo(String nome_pessoa, int idade_pessoa){
		nome = nome_pessoa;
		idade = idade_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
}
