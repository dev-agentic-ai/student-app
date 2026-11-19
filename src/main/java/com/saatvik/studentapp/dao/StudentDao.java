package com.saatvik.studentapp.dao;

import com.saatvik.studentapp.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentEntity, Long> {
}
