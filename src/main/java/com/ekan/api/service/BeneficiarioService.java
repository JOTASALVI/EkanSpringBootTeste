package com.ekan.api.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekan.api.entity.Beneficiario;
import com.ekan.api.entity.Documento;
import com.ekan.api.repository.BeneficiarioRepository;
import com.ekan.api.util.DataUtil;

import jakarta.transaction.Transactional;



@Service
public class BeneficiarioService {
	
	@Autowired
	private BeneficiarioRepository benRep;
	
	@Autowired
	private DocumentoService docService;
	
	private DataUtil dataUtil = new DataUtil();
	

	
	@Transactional
	public Beneficiario salvar(Beneficiario beneficiario) {
		
		Beneficiario benef = beneficiario;
		List<Documento> docs = new ArrayList<>(beneficiario.getDocumentos());
		
		benef.setDataNascimento(dataUtil.adicionaHoras(beneficiario.getDataNascimento(), 3));
		benef.setDataInclusao(new Date());
		benef = benRep.save(benef);
		
		benef.setDocumentos(docs);
		
		for(Documento doc : benef.getDocumentos()) {
			doc.setDataInclusao(new Date());
			docService.salvar(doc);
		}
		return benef;
	}
	
	public List<Beneficiario> listarBeneficiarios(){
		List<Beneficiario> list = new ArrayList<Beneficiario>(benRep.findAll());
		
		return list;
	}

	public Beneficiario buscarPorId(Long id) {
		Optional<Beneficiario> optional = benRep.findById(id);
		if(optional.isPresent()) {
			Beneficiario beneficiario = optional.get();
			return beneficiario;
		}else {
			throw new RuntimeException("Não foi possivel localizar o beneficiario"); 
		}
		
	}

	public Beneficiario atualizar(Long id, Beneficiario beneficiario) {
		
		Optional<Beneficiario> optional = benRep.findById(id);
		if(optional.isPresent()) {
			Beneficiario benef = optional.get();
			benef.setNome(beneficiario.getNome());
			benef.setTelefone(beneficiario.getTelefone());
			benef.setDataNascimento(dataUtil.adicionaHoras(beneficiario.getDataNascimento(), 3));
			benef.setDataAtualizacao(new Date());
			return benRep.save(benef);
		}else {
			throw new RuntimeException("Não foi possivel localizar o beneficiario"); 
		}
	}

	public void delete(Long id) {
		Optional<Beneficiario> optional = benRep.findById(id);
		if(optional.isPresent()) {
			benRep.deleteById(id);
		}else {
			throw new RuntimeException("Não foi possivel localizar o beneficiario"); 
		}
		
	}
	
}
