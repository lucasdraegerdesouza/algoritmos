package Java_polimorfismo;

import java.util.Date;

public class Clientes{
		private String nome;
		private Date dtnascimento;
		private String cpf;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Date getDtnascimento() {
			return dtnascimento;
		}
		public void setDtnascimento(Date dtnascimento) {
			this.dtnascimento = dtnascimento;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public Clientes(){
		}
		
		public Clientes(String nome, Date dtnascimento, String cpf) {
			this.nome = nome;
			this.dtnascimento = dtnascimento;
			this.cpf = cpf;
		}
		
		
		
		
}
