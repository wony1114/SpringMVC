package com.example.demo.uss.service;

import java.util.List;

import com.example.demo.uss.service.model.Student;

import org.springframework.stereotype.Component;

@Component
public interface StudentService {

    public int register(Student student);

	public Student login(Student student);

	public Student detail(String userid);

	public List<?> list();

}