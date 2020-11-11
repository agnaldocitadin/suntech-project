package com.suntech.project;

import javax.persistence.EntityManager;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseService {

	private EntityManager entityManager;

	protected JPAQuery createJPAQuery() {
		JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(entityManager);
		return jpaQueryFactory.query();
	}
}
