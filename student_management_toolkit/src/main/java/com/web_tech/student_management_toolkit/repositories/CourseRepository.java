package com.web_tech.student_management_toolkit.repositories;

import com.web_tech.student_management_toolkit.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
