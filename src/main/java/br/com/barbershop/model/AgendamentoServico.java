package br.com.barbershop.model;

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
 * Descrição: Classe para modelo agendamento de serviços
 * Data: 03/09/2018
 * Horário: 12:20 
 * Autor: José Walter
 */

@Entity
@Table(name = "tbl_agendamento_servico")
public class AgendamentoServico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "agen_id")
	private Integer idAgendamento;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "agen_horario_inicio", nullable = false)
	private Date horarioInicio;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "agen_horario_termino", nullable = false)
	private Date horarioTermino;

	@Column(name = "agen_valor_total", precision = 7, scale = 2, nullable = false)
	private double valor;

	@Column(name = "agen_produto_cliente", length = 50, nullable = false)
	private String produtoCliente;

	@Column(name = "agen_produto_salao", length = 50, nullable = false)
	private String produtoSalao;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_cliente_cli_id", referencedColumnName = "cli_id", nullable = false)
	private Cliente cliente;

//===============================================================================================
	//Construtores da classe
	public AgendamentoServico() {

	}

	public AgendamentoServico(Integer idAgendamento, Date horarioInicio, Date horarioTermino, double valor,
			String produtoCliente, String produtoSalao, Cliente cliente) {

		this.idAgendamento = idAgendamento;
		this.horarioInicio = horarioInicio;
		this.horarioTermino = horarioTermino;
		this.valor = valor;
		this.produtoCliente = produtoCliente;
		this.produtoSalao = produtoSalao;
		this.cliente = cliente;
	}

// ================================================================================================
	// Getters and Setters
	public Integer getIdAgendamento() {
		return idAgendamento;
	}

	public void setIdAgendamento(Integer idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

	public Date getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(Date horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public Date getHorarioTermino() {
		return horarioTermino;
	}

	public void setHorarioTermino(Date horarioTermino) {
		this.horarioTermino = horarioTermino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getProdutoCliente() {
		return produtoCliente;
	}

	public void setProdutoCliente(String produtoCliente) {
		this.produtoCliente = produtoCliente;
	}

	public String getProdutoSalao() {
		return produtoSalao;
	}

	public void setProdutoSalao(String produtoSalao) {
		this.produtoSalao = produtoSalao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

// ===================================================================================================================
	// toString
	@Override
	public String toString() {
		return "AgendamentoServico [idAgendamento=" + idAgendamento + ", horarioInicio=" + horarioInicio
				+ ", horarioTermino=" + horarioTermino + ", valor=" + valor + ", produtoCliente=" + produtoCliente
				+ ", produtoSalao=" + produtoSalao + ", cliente=" + cliente + "]";
	}

// ====================================================================================================================
	// Hash Code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((horarioInicio == null) ? 0 : horarioInicio.hashCode());
		result = prime * result + ((horarioTermino == null) ? 0 : horarioTermino.hashCode());
		result = prime * result + ((idAgendamento == null) ? 0 : idAgendamento.hashCode());
		result = prime * result + ((produtoCliente == null) ? 0 : produtoCliente.hashCode());
		result = prime * result + ((produtoSalao == null) ? 0 : produtoSalao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		AgendamentoServico other = (AgendamentoServico) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (horarioInicio == null) {
			if (other.horarioInicio != null)
				return false;
		} else if (!horarioInicio.equals(other.horarioInicio))
			return false;
		if (horarioTermino == null) {
			if (other.horarioTermino != null)
				return false;
		} else if (!horarioTermino.equals(other.horarioTermino))
			return false;
		if (idAgendamento == null) {
			if (other.idAgendamento != null)
				return false;
		} else if (!idAgendamento.equals(other.idAgendamento))
			return false;
		if (produtoCliente == null) {
			if (other.produtoCliente != null)
				return false;
		} else if (!produtoCliente.equals(other.produtoCliente))
			return false;
		if (produtoSalao == null) {
			if (other.produtoSalao != null)
				return false;
		} else if (!produtoSalao.equals(other.produtoSalao))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}
