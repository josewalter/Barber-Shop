package br.com.barbershop.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * Descrição: Classe para modelo produtos
 * Data: 31/08/2018
 * Horário: 12:00
 * Autor: José Walter
 */

@Entity
@Table(name = "tbl_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pro_id_produto")
	private Integer idProduto;
	
	@Column(name = "pro_descricao", length = 50, nullable = false)
	private String descricao;
	
	@Column(name = "pro_preco", scale = 7, precision = 2, nullable = false)
	private double preco;
	
	@Column(name = "pro_quantidade", nullable = false)
	private Integer quantidade;
	
//===================================================================================================

	public Produto() {
		
	}

	public Produto(Integer idProduto, String descricao, double preco, Integer quantidade) {
		
		this.idProduto = idProduto;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}

//=============================================================================
	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	

//====================================================================
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", descricao=" + descricao +
				", preco=" + preco + ", quantidade=" + quantidade +
				 "]";
	}

//================================================================================	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((idProduto == null) ? 0 : idProduto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
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
		Produto other = (Produto) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idProduto == null) {
			if (other.idProduto != null)
				return false;
		} else if (!idProduto.equals(other.idProduto))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}
}
