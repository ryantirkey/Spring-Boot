package com.ty.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.binding.Student;
import com.ty.entity.StudentEntity;
import com.ty.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public List<String> getCourse(){
		return Arrays.asList("Java", "Python", "ReactJs");
	}
	
	public List<String> getTimings(){
		return Arrays.asList("Morning", "Afternoon", "Evening");
	}
	
	public boolean saveData(Student student) {
		
		StudentEntity entity= new StudentEntity();
		
//		If any field is different b/w java class and entity class we need to manually set them 
		entity.setTimings(Arrays.toString(student.getTimings()));
		
		BeanUtils.copyProperties(student, entity); //BeanUtils.copyProperties(Obj source, obj target), it is used to copy data from java class into entity class(one class to another), requires two parameters source obj that is java class that we have used to bind with form and target obj in which we want to copy data. 
		
		repository.save(entity);
		
		return true;
	}

}
