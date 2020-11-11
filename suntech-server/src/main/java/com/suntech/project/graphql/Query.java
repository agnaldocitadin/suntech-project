package com.suntech.project.graphql;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.suntech.project.residence.model.Residence;
import com.suntech.project.residence.service.ResidenceService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

	private ResidenceService residenceService;

	public List<Residence> findAllResidences() {
		return residenceService.findAll();
	}

//
//	public Residencia buscarClientePorId(Long id) {
//		return clienteRepository.findById(id).get();
//	}
//
//	public String autenticar(String login, String senha) {
//		return segurancaService.buscaUsuario(login, senha);
//	}

}
