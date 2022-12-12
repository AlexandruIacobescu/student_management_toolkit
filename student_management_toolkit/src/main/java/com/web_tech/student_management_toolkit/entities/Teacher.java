package com.web_tech.student_management_toolkit.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity(name = "teachers")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Date dob;

    @OneToOne(
            mappedBy = "teacher",
            cascade = CascadeType.ALL
    )
    @PrimaryKeyJoinColumn
    private Course course;

}
