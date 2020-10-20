package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface Staff_ProvinceDao extends JpaRepository<Staff_ProvinceDao,String>, JpaSpecificationExecutor<Staff_ProvinceDao> {
}
