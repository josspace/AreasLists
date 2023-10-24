package com.cmepps.areaslists.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.areaslists.model.Todo;

public interface TodoRepository extends JpaRepository < Todo, Long > {
    List < Todo > findByUserName(String user);
}
