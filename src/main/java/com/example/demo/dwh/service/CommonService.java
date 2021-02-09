package com.example.demo.dwh.service;
import static com.example.demo.dwh.domain.Util.*;
import static java.util.stream.Collectors.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dwh.domain.Box;
import com.example.demo.dwh.domain.Sql;
import com.example.demo.dwh.domain.Vector;
import com.example.demo.dwh.mapper.CommonMapper;

@Service
public class CommonService {
	@Autowired CommonMapper commonMapper;
	@Autowired Box<String> bx;
	@Autowired Vector<String> vc;
	
	@Transactional
	public int generateDB() {
		var map = new HashMap<String,String>();
		List<String> l1 = Arrays.asList(
				Sql.DROP_TABLE.toString()+"replies",
				Sql.DROP_TABLE.toString()+"articles",
				Sql.DROP_TABLE.toString()+"grades",
				Sql.DROP_TABLE.toString()+"teachers",
				Sql.DROP_TABLE.toString()+"students",
				Sql.DROP_TABLE.toString()+"subjects",
				Sql.DROP_TABLE.toString()+"managers"
				)
		;
		List<String> l2 = Arrays.asList(
				Sql.CREATE_MANAGERS.toString(),
				Sql.CREATE_SUBJECTS.toString(),
				Sql.CREATE_STUDENTS.toString(),
				Sql.CREATE_TEACHERS.toString(),
				Sql.CREATE_GRADES.toString(),
				Sql.CREATE_ARTICLES.toString(),
				Sql.CREATE_REPLIES.toString())
		;
		for(int i=0; i< l1.size(); i++) {
			map.put("DROP_TABLE", l1.get(i));
			commonMapper.dropTable(map);
			map.clear();
		}
		for(int i=0; i< l2.size(); i++) {
			map.put("CREATE_TABLE", l2.get(i));
			commonMapper.createTable(map);
			map.clear();
		}
		bx.put("TABLE_COUNT", Sql.TABLE_COUNT.toString());
		
		
		
		return (commonMapper.tableCount(map)!=0) ? 1: 0;
	}
	public int totalCount() {
		return 0;
	}
	public int dropTable() {
		return 0;
	}
	
}