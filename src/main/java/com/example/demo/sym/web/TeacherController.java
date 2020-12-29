package com.example.demo.sym.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.sym.service.Teacher;
import com.example.demo.sym.service.TeacherService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    TeacherService teacherService;

    @PostMapping("")
    public Map<?, ?> register(@RequestBody Teacher teacher) {
        var map = new HashMap<>();
        logger.info("등록하려는 교강사정보: " + teacher.toString());
        map.put("message", (teacherService.register(teacher) == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }

    @GetMapping("")
    public List<?> list() {
        logger.info("교강사 목록 요청 진입");
        return teacherService.list();
    }

    @GetMapping("/{teaNum}")
    public Teacher findById(@PathVariable String teaNum) {
        logger.info("교강사번호 조회 요청 진입 : 조회번호 =" + teaNum);
        return teacherService.findById(teaNum);
    }
    @PutMapping("")
    public Map<?, ?> update(@RequestBody Teacher teacher){
        logger.info("교강사번호 조회 요청 진입 : 수정정보 =" + teacher.toString());
        var map = new HashMap<>();
        int result = teacherService.update(teacher);
        map.put("message", (result ==1) ?"SUCCESS" :"FAILURE");
        return map;
    }
    @DeleteMapping("")
    public Map<?, ?> delete(@RequestBody Teacher teacher){
       
        var map = new HashMap<>();
        int result = teacherService.delete(teacher);
        map.put("message", (result ==1) ?"SUCCESS" :"FAILURE");
        return map;
    }
}