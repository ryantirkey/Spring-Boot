package com.ty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
