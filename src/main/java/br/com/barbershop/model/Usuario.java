package br.com.barbershop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "usu_id")
	private Integer id;
	
	@Column(name = "usu_nome_usuario", length = 35, nullable = false)
    private String nomeUsuario;
	
	@Column(name = "usu_endereco", length = 35, nullable = false)
    private String endereco;
	
	@Column(name = "usu_bairro", length = 25, nullable = false)
    private String bairro;
	
	@Column(name = "usu_cidade", length = 30, nullable = false)
    private String cidade;
	
	@Column(name = "usu_uf", length = 5, nullable = false)
    private String uf;
	
	@Column(name = "usu_cep", length = 10, nullable = false)
    private String cep;
	
	@Column(name = "usu_cpf", length = 15, nullable = false)
    private String cpf;
	
	@Column(name = "usu_telefone_residencial", length = 14, nullable = false)
    private String telefoneResidencial;
	
	@Column(name = "usu_celular", length = 15, nullable = false)
    private String celular;
	
	@Column(name = "usu_email", length = 30, nullable = false)
    private String email; 
	
	@Column(name = "usu_senha", length = 32, nullable = false)
	private String senha;
	
//==========================================================================================================
	public Usuario(Integer id, String nomeUsuario, String endereco, String bairro, String cidade, String uf, String cep,
			String cpf, String telefoneResidencial, String celular, String email, String senha) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.cpf = cpf;
		this.telefoneResidencial = telefoneResidencial;
		this.celular = celular;
		this.email = email;
		this.senha = senha;
	}

	
	public Usuario (){
		
		
	}

//=====================================================================================
	//Getters AND Setters
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
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


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}


	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
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


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

//===================================================================================================================
	//toString
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nomeUsuario=" + nomeUsuario + ", endereco=" + endereco + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + ", cpf=" + cpf + ", telefoneResidencial="
				+ telefoneResidencial + ", celular=" + celular + ", email=" + email + ", senha=" + senha + "]";
	}

//===================================================================================================================
	//HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeUsuario == null) ? 0 : nomeUsuario.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((telefoneResidencial == null) ? 0 : telefoneResidencial.hashCode());
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
		Usuario other = (Usuario) obj;
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
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
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
		if (nomeUsuario == null) {
			if (other.nomeUsuario != null)
				return false;
		} else if (!nomeUsuario.equals(other.nomeUsuario))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (telefoneResidencial == null) {
			if (other.telefoneResidencial != null)
				return false;
		} else if (!telefoneResidencial.equals(other.telefoneResidencial))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
	
	
}
