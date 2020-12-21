package com.example.demo.sym.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.sym.service.model.Teacher;

import org.springframework.stereotype.Component;

@Component
public interface TeacherService {
    public int register(Teacher teacher);

    public List<?> list();

    public Teacher findById(String teaNum);

	public int update(Teacher teacher);

	public int delete(Teacher teacher);
}