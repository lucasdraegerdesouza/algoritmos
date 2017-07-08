package Java_polimorfismo;

public class Testeponto {
		public static void main(String[] args) {
			Gerente gr = new Gerente();
			gr.setNome("Lucas");
			Telefonista tf = new Telefonista();
			tf.setNome("Stefanie");
			ControlePonto cp = new ControlePonto();
			cp.registraEntrada(gr);
			cp.registraEntrada(tf);
			cp.registraSaida(gr);
			cp.registraSaida(tf);
		}
}
