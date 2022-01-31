package com.jobSearch.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobSearch.Model.Company;

@Repository
public interface CompanyDao extends JpaRepository<Company, Long> {
	
}
