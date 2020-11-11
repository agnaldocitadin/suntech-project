package com.suntech.project.residence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suntech.project.residence.model.Residence;

@Repository
public interface ResidenceRepository extends JpaRepository<Residence, Long> {}
