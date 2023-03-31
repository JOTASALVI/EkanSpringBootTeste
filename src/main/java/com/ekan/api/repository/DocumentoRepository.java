package com.ekan.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.ekan.api.entity.Documento;

public interface DocumentoRepository extends CrudRepository<Documento, Long>{
	
}
