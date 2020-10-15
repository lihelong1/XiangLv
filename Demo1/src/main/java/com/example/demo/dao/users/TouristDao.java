package com.example.demo.dao.users;

import com.example.demo.pojo.users.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TouristDao extends JpaRepository<Tourist,String>, JpaSpecificationExecutor<Tourist> {

}
