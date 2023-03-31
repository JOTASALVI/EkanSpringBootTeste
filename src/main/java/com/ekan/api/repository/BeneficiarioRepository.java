package com.ekan.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ekan.api.entity.Beneficiario;

public interface BeneficiarioRepository extends CrudRepository<Beneficiario, Long>{
	
	List<Beneficiario> findAll();
	
}
