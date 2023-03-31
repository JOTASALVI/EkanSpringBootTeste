package com.ekan.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekan.api.entity.Beneficiario;
import com.ekan.api.service.BeneficiarioService;

@RestController
@RequestMapping("/beneficiarios")
public class BeneficiarioController {
	
	@Autowired
	private BeneficiarioService benService;
	
	@PostMapping
	public String salvar(@RequestBody Beneficiario beneficiario) {
		Beneficiario benef = benService.salvar(beneficiario);
		return "Benefeciario e Documentos salvos com sucesso!! " + benef.getNome();
	}
	
	@GetMapping
	public List<Beneficiario> listarBeneficiarios(){
		List<Beneficiario> benefs = benService.listarBeneficiarios();
		return benefs;
	}
	
	@GetMapping("/{id}")
	public Beneficiario buscarPorId(@PathVariable("id") Long id) {
		return benService.buscarPorId(id);
	}
	
	@PutMapping("/{id}")
	public String atualizar(@PathVariable("id") Long id,@RequestBody Beneficiario beneficiario) {
		Beneficiario benef = benService.atualizar(id,beneficiario);
		return "Benefeciario atualizado com sucesso!! " + benef.getNome();
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Long id) {
		benService.delete(id);
		
		return "Beneficiario deletado com sucesso!";
	}
	
}
