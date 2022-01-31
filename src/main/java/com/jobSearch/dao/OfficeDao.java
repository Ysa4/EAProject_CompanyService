package com.jobSearch.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobSearch.Model.Office;
@Repository
public interface OfficeDao extends JpaRepository<Office, Long> {

}
