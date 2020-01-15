package com.ivcho.spring.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.ivcho.spring.model.Company;
import com.ivcho.spring.model.Office;

public class OfficeDAO extends GenericDaoImpl<Office, Long> {
	
	public List<Office> findByCompanyName(String name) {
		CriteriaBuilder builder = criteriaBuilder();
		CriteriaQuery<Office> criteria = builder.createQuery(Office.class);
		Root<Office> root = criteria.from(Office.class);
		
		criteria.select(root);
		
		criteria.where(builder.equal(root.get(Office._company).get(Company._name), name));
		
		return createQuery(criteria).getResultList();
	}
}
