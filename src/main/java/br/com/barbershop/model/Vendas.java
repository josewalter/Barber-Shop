package br.com.barbershop.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Descrição: Classe Modelo Vendas
 * Data: 31/08/2018
 * Horário: 13:00
 * Autor: José Walter
 */

@Entity
@Table(name = "tbl_venda")
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ven_id")
	private Integer idVenda;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "ven_horario", nullable = false)
	private Date horario;

	@Column(name = "ven_valor_total", precision = 7, scale = 2, nullable = false)
	private BigDecimal valor;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_usuario_usu_id", referencedColumnName = "usu_id", nullable = false)
	private Usuario usuario;

	// =============================================================================================
	public Vendas() {

	}

	public Vendas(Integer idVenda, Date horario, BigDecimal valor, Usuario usuario) {
		super();
		this.idVenda = idVenda;
		this.horario = horario;
		this.valor = valor;
		this.usuario = usuario;
	}

	// ============================================================================================
	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	// ===================================================================
	@Override
	public String toString() {
		return "Vendas [idVenda=" + idVenda + ", horario=" + horario 
				+ ", valor=" + valor + ", usuario=" + usuario
				+ "]";
	}

	// ==========================================================================
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		result = prime * result + ((idVenda == null) ? 0 : idVenda.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendas other = (Vendas) obj;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (idVenda == null) {
			if (other.idVenda != null)
				return false;
		} else if (!idVenda.equals(other.idVenda))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
}
