package com.suntech.project.residence.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RESIDENCE")
public class Residence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "zip_code", nullable = false)
	private Integer zipCode;

	@Column(name = "residence_number", nullable = false)
	private Integer residenceNumber;

	@Column(name = "residents_amount", nullable = false)
	private Integer residentsAmount;

	@Embedded
	private Location location;

}


