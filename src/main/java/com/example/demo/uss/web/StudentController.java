package com.example.demo.uss.web;

import java.util.Map;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.cmm.enm.Sql;
import com.example.demo.cmm.enm.Table;
import com.example.demo.cmm.service.CommonMapper;
import com.example.demo.cmm.utl.Pagination;
import com.example.demo.cmm.utl.Util;
import com.example.demo.sts.service.GradeService;
import com.example.demo.sts.service.SubjectMapper;
import com.example.demo.sts.service.SubjectService;
import com.example.demo.sym.service.ManagerService;
import com.example.demo.sym.service.TeacherMapper;
import com.example.demo.sym.service.TeacherService;
import com.example.demo.uss.service.Student;
import com.example.demo.uss.service.StudentMapper;
import com.example.demo.uss.service.StudentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import static com.example.demo.cmm.utl.Util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired StudentService studentService;
    @Autowired GradeService gradeService;
    @Autowired StudentMapper studentMapper;
    @Autowired SubjectService subjectService;
    @Autowired TeacherService teacherService;
    @Autowired ManagerService managerService;
    @Autowired CommonMapper commonMapper;
    @Autowired Pagination page;
    @PostMapping("")
    public Messenger register(@RequestBody Student s){
        return studentMapper.insert(s)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
    @PostMapping("/login")
    public Map<?,?> login(@RequestBody Student s){
        var map = new HashMap<>();
        Student result = studentMapper.login(s);
        map.put("message", result!=null?"SUCCESS":"FAILURE");
        map.put("sessionUser", result);
        return map;
    }
    /*
    @GetMapping("/{userid}")
    public Student profile(@PathVariable String userid){
        return studentMapper.selectById(userid);
    }
    */
    @GetMapping("/page/{pageSize}/{pageNum}")
    public Map<?,?> list(@PathVariable String pageSize, 
    					@PathVariable String pageNum){
    	logger.info("Students List Execute ...");
    	var map = new HashMap<String, Object>();
    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.STUDENTS);	
    	var page = new Pagination(
				Table.STUDENTS.toString(), 
				integer.apply(pageSize),
				integer.apply(pageNum),
				commonMapper.totalCount(map))
				;
    	map.clear();
    	map.put("list", studentService.list(page));
    	map.put("page", page);
        return map;
    }
    @GetMapping("/page/{pageSize}/{pageNum}/selectAll")
    public List<?> selectAll(@PathVariable String pageSize, 
    					@PathVariable String pageNum){
    	logger.info("Students List Execute ...");
    	var map = new HashMap<String, Object>();
    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.STUDENTS);	
        return studentMapper.selectAll(new Pagination(
				Table.STUDENTS.toString(), 
				integer.apply(pageSize),
				integer.apply(pageNum),
				commonMapper.totalCount(map)));
    }
    
    @PutMapping("")
    public Messenger update(@RequestBody Student s){
        return studentMapper.update(s)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
    @DeleteMapping("")
    public Messenger delete(@RequestBody Student s){
    	logger.info("Students Deleted Execute ...");
        return studentMapper.delete(s) ==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
    
    @GetMapping("/insert-many/{count}")
    public String insertMany(@PathVariable String count) {
    	logger.info(String.format("Insert %s Students ...",count));
    	var map = new HashMap<String, Object>();
    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.STUDENTS);
    	if(commonMapper.totalCount(map) == 0) {
    		managerService.insertMany(1);
        	subjectService.insertMany(5);
        	studentService.insertMany(Integer.parseInt(count));
        	teacherService.insertMany(5);
        	//gradeService.insertMany(Integer.parseInt(count)); 나중에 추가함
    	}
    	map.clear();
    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.STUDENTS);
    	return string.apply(commonMapper.totalCount(map));
    }
    @GetMapping("/count")
    public String count() {
    	logger.info(String.format("Count Students ..."));
    	var map = new HashMap<String, Object>();
    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.STUDENTS);	
    	return string.apply(commonMapper.totalCount(map));
    }
    @GetMapping("/find-by-gender/{gender}")
    public List<Student> findByGender(@PathVariable String gender) {
    	logger.info(String.format("Find By %s from Students ...", gender));
    	return null; //studentService.selectByGender(gender);
    }
}