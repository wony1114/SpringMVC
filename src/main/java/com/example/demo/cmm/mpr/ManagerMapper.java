package com.example.demo.cmm.mpr;

import org.springframework.stereotype.Repository;

import com.example.demo.sym.service.model.Manager;

@Repository
public interface ManagerMapper {
	public int insert(Manager manager);
}
