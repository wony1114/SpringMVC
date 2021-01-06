package com.example.demo.uss.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cmm.utl.DummyGenerator;

@Service
public class StudentService{
    @Autowired StudentMapper studentMapper;
    @Autowired DummyGenerator dummy;
    public int register(Student s) {
        return studentMapper.insert(s);
    }
    public void insertMany(int count) {
    	for(int i = 0; i < count; i++) {
    		studentMapper.insert(dummy.makeStudent());
    	}
    }
   
    public Student login(Student s) {
        
        return studentMapper.login(s);
    }

    
    public Student detail(String userid) {
        
        return studentMapper.selectById(userid);
    }


    public List<?> list() {
        
        return studentMapper.selectAll();
    }
    public void truncate() {
    	var map = new HashMap<String, String>();
    	map.put("TRUNCATE_STUDENTS", "Sql.TRUNCATE_STUDENTS.toString()");
    	studentMapper.truncate(map);
    }

}