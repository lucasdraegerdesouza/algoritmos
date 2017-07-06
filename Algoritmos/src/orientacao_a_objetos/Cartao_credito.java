package orientacao_a_objetos;

import java.util.Date;

public class Cartao_credito {
		private int card_credito_numero;
		private Date card_credito_validade;
		private Cliente cliente;
		public int getCard_credito_numero() {
			return card_credito_numero;
		}
		public void setCard_credito_numero(int card_credito_numero) {
			this.card_credito_numero = card_credito_numero;
		}
		public Date getCard_credito_validade() {
			return card_credito_validade;
		}
		public void setCard_credito_validade(Date card_credito_validade) {
			this.card_credito_validade = card_credito_validade;
		}
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
}
