package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface Association_tbDao extends JpaRepository<Association_tbDao,String>, JpaSpecificationExecutor<Association_tbDao> {
}
