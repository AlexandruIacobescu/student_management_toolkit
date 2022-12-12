package com.web_tech.student_management_toolkit.repositories;

import com.web_tech.student_management_toolkit.entities.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepository extends JpaRepository<Mark,Long> {
}
