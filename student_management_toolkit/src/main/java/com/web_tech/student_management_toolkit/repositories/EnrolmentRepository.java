package com.web_tech.student_management_toolkit.repositories;

import com.web_tech.student_management_toolkit.entities.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrolmentRepository extends JpaRepository<Enrolment,Long> {
}
