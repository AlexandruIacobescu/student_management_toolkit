package com.web_tech.student_management_toolkit.repositories;

import com.web_tech.student_management_toolkit.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
