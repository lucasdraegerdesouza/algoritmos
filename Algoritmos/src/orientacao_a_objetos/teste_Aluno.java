package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class teste_Aluno {
		public static void main(String[] args) throws ParseException {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			Aluno aluno = new Aluno();
			aluno.nome = "Lucas";
			aluno.rg = "123456";
			aluno.dtnascimento = sdf.parse("27/01/1995");
			
			Turma t = new Turma();
			aluno.turma.turno = "Noturno";
			
	
			aluno.turma = t;
			
			
			System.out.println(aluno.nome);
			System.out.println(aluno.rg);
			System.out.println(aluno.dtnascimento);
			System.out.println(aluno.turma.turno);
			
		}
}
