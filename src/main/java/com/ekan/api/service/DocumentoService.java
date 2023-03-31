package com.ekan.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekan.api.entity.Documento;
import com.ekan.api.repository.DocumentoRepository;

import jakarta.transaction.Transactional;



@Service
public class DocumentoService {
	
	@Autowired
	private DocumentoRepository docRep;
		
	@Transactional
	public Documento salvar(Documento documento) {
		
		return docRep.save(documento);
	}
	
}
