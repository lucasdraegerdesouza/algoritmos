package orientacao_a_objetos;

public class teste_turma {
		public static void main(String[] args) {
			Turma turma = new Turma();
			turma.turno = "Matutino";
			turma.serie = 1;
			turma.sigla = "JAV";
			turma.tipoEnsino = "Presencial";
			
			System.out.println(turma.turno);
			System.out.println(turma.serie);
			System.out.println(turma.sigla);
			System.out.println(turma.tipoEnsino);
		}
}
