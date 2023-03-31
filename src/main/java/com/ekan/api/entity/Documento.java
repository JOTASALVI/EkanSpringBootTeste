package com.ekan.api.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Documento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_documento;
	private String tipoDocumento;
	private String descricao;
	private Date dataInclusao;
	private Date dataAtualizacao;
	
	/*
	 * @ManyToOne()
	 * 
	 * @JoinColumn(name="beneficiario_id_beneficiario")
	 * //,referencedColumnName="id_beneficiario" private Beneficiario beneficiario;
	 */

	public Documento() {

	}
	
	
	/*
	 * @PreUpdate public void preUpdate() { dataAtualizacao = new Date(); }
	 * 
	 * @PrePersist public void prePersist() { final Date atual = new Date();
	 * dataInclusao = atual; //dataAtualizacao = atual; }
	 */
    
	public Documento(Long id, String tipoDocumento, String descricao, Date dataInclusao, Date dataAtualizacao) {
		
		this.id_documento = id;
		this.tipoDocumento = tipoDocumento;
		this.descricao = descricao;
		this.dataInclusao = dataInclusao;
		this.dataAtualizacao = dataAtualizacao;
	}

	public Long getId() {
		return id_documento;
	}

	public void setId(Long id_documento) {
		this.id_documento = id_documento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	/*
	 * public Beneficiario getBeneficiario() { return beneficiario; }
	 * 
	 * public void setBeneficiario(Beneficiario beneficiario) { this.beneficiario =
	 * beneficiario; }
	 */
	
}
