package br.com.barbershop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_fornecedores")
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "forn_id")
	private Integer id;
	
	@Column(name = "forn_nome_fornecedor", length=30, nullable=false)
	private String nomeFornecedor;
	
	@Column(name = "forn_endereco", length=30, nullable=false)
	private String endereco;
	
	@Column(name = "forn_bairro", length=25, nullable=false)
	private String bairro;
	
	@Column(name = "forn_nome_", length=20, nullable=false)
	private String uf;
	
	@Column(name = "forn_cnpj", length=14, nullable=false)
	private String cnpj;
	
	@Column(name = "forn_telefone_comercial", length=14, nullable=false)
	private String telefoneComercial;
	
	@Column(name = "forn_celular", length=15, nullable=false)
	private String celular;
	
	@Column(name = "forn_email", length=30, nullable=false)
	private String email;
	
//========================================================================================================
	//construtores
	public Fornecedor(){
		
	}
	
    public Fornecedor(String nomeFornecedor, String endereco, String bairro, String uf, String cnpj, String 
    		          telefoneComercial, String celular, String email){
		this.nomeFornecedor = nomeFornecedor;
		this.endereco = endereco;
		this.bairro = bairro;
		this.uf = uf;
		this.cnpj = cnpj;
		this.telefoneComercial = telefoneComercial;
		this.celular = celular;
		this.email = email;
	}

//=========================================================================================================
    //Métodos Getters And Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
//===============================================================================
	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nomeFornecedor=" + nomeFornecedor + ","
				+ " endereco=" + endereco + ", bairro="	+ bairro + ", uf=" + uf + ","
				+ " cnpj=" + cnpj + ", telefoneComercial=" + telefoneComercial + ","
				+ " celular=" + celular + ", email=" + email + "]";
	}
	
//========================================================================================
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeFornecedor == null) ? 0 : nomeFornecedor.hashCode());
		result = prime * result + ((telefoneComercial == null) ? 0 : telefoneComercial.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeFornecedor == null) {
			if (other.nomeFornecedor != null)
				return false;
		} else if (!nomeFornecedor.equals(other.nomeFornecedor))
			return false;
		if (telefoneComercial == null) {
			if (other.telefoneComercial != null)
				return false;
		} else if (!telefoneComercial.equals(other.telefoneComercial))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
	
}
