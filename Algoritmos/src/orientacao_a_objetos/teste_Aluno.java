package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class teste_Aluno {
		public static void main(String[] args) throws ParseException {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			Aluno aluno = new Aluno();
			aluno.setNome("Lucas");
			aluno.setRg("123456");
			aluno.setDtnascimento(sdf.parse("27/01/1995"));
			
			Turma t = new Turma();
			t.turno = "Noturno";
			
	
			aluno.setTurma(t);
			
			
			System.out.println(aluno.getNome());
			System.out.println(aluno.getRg());
			System.out.println(sdf.format(aluno.getDtnascimento()));
			System.out.println(aluno.getTurma().turno);
			
		}
}
