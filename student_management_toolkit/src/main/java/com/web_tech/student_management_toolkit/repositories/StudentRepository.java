package com.web_tech.student_management_toolkit.repositories;

import com.web_tech.student_management_toolkit.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
