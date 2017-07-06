package orientacao_a_objetos;

import java.util.Date;

public class Aluno {

			private String nome;
			private String rg;
			private Date dtnascimento;
			private Turma turma;
			
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getRg() {
				return rg;
			}
			public void setRg(String rg) {
				this.rg = rg;
			}
			public Date getDtnascimento() {
				return dtnascimento;
			}
			public void setDtnascimento(Date dtnascimento) {
				this.dtnascimento = dtnascimento;
			}
			public Turma getTurma() {
				return turma;
			}
			public void setTurma(Turma turma) {
				this.turma = turma;
			}

}

