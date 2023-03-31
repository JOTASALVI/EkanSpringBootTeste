package com.ekan.api.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Beneficiario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_beneficiario;
	private String nome;
	private String telefone;
	private Date dataNascimento;
	private Date dataInclusao;
	private Date dataAtualizacao;
	
	//@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY,mappedBy = "beneficiario")
	@OneToMany(targetEntity = Documento.class,cascade = CascadeType.ALL)
	@JoinColumn(name="BENEFICIARIO_ID_BENEFICIARIO",referencedColumnName = "id_beneficiario")
	private List<Documento> documentos;
	
	public Beneficiario() {
		
	}	
	

	public Beneficiario(Long id_beneficiario, String nome, String telefone, Date dataNascimento, Date dataInclusao,
			Date dataAtualizacao) {

		this.id_beneficiario = id_beneficiario;
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.dataInclusao = dataInclusao;
		this.dataAtualizacao = dataAtualizacao;
	}


	/*
	 * @PreUpdate public void preUpdate() { dataAtualizacao = new Date(); }
	 * 
	 * @PrePersist public void prePersist() { final Date atual = new Date();
	 * dataInclusao = atual; //dataAtualizacao = atual; }
	 */

	public Long getId() {
		return id_beneficiario;
	}

	public void setId(Long id_beneficiario) {
		this.id_beneficiario = id_beneficiario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	
}
