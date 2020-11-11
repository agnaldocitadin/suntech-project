package com.suntech.project.graphql;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.suntech.project.residence.model.Residence;
import com.suntech.project.residence.service.ResidenceService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

	private ResidenceService residenceService;

	public Residence saveResidence(Residence residence) {
		return residenceService.save(residence);
	}

	public boolean removeResidence(Long id) {
		return residenceService.remove(id);
	}

}
