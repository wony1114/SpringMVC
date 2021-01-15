package com.example.demo.uss.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cmm.utl.Box;
import com.example.demo.cmm.utl.Pagination;

@Repository
public interface StudentMapper {

	public int insert(Student s);
	public Student login(Student s);
	public List<Student> selectAll(Pagination page);
	public List<Student> list();
	public int update(Student s);
	public int delete(Student s);
	public void truncate(Box<String> bx);
	public int count(Box<String> bx);
    
}