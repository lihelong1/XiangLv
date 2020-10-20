package com.example.demo.dao;

import com.example.demo.pojo.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ScoreDao extends JpaRepository<Score,String>, JpaSpecificationExecutor<Score> {
}
