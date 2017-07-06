package orientacao_a_objetos;

import java.util.Date;

public class CartaoCredito {
		private String numero;
		private Date datavalidade;
		private Cliente cliente;
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public Date getDatavalidade() {
			return datavalidade;
		}
		public void setDatavalidade(Date datavalidade) {
			this.datavalidade = datavalidade;
		}
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}		
}
