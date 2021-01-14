package com.example.demo.sts.service;

import java.util.List;

public interface SubjectMapper {

	public int insertMany(List<Subject> list);
	public List<String> selectAllSubject();
}
