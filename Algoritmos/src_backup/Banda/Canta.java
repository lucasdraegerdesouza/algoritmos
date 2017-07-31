package Banda;

import java.sql.Date;

public class Canta {

	private int can_codigo;//primary key
	private Date can_ano_gravacao;
	private int can_banda;//foreign key da ban_codigo
	private int can_musica;//foreign key da mus_codigo
	private int can_gravadora;//foreign key da can_codigo
	private int can_estilo;//foreign key do est_codigo
	
	public int getCan_codigo() {
		return can_codigo;
	}
	public void setCan_codigo(int can_codigo) {
		this.can_codigo = can_codigo;
	}
	public Date getCan_ano_gravacao() {
		return can_ano_gravacao;
	}
	public void setCan_ano_gravacao(Date can_ano_gravacao) {
		this.can_ano_gravacao = can_ano_gravacao;
	}
	public int getCan_banda() {
		return can_banda;
	}
	public void setCan_banda(int can_banda) {
		this.can_banda = can_banda;
	}
	public int getCan_musica() {
		return can_musica;
	}
	public void setCan_musica(int can_musica) {
		this.can_musica = can_musica;
	}
	public int getCan_gravadora() {
		return can_gravadora;
	}
	public void setCan_gravadora(int can_gravadora) {
		this.can_gravadora = can_gravadora;
	}
	public int getCan_estilo() {
		return can_estilo;
	}
	public void setCan_estilo(int can_estilo) {
		this.can_estilo = can_estilo;
	}
	
	
}
