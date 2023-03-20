package com.backendengineer.springboottutorial.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseid;
    private String title;
    private Integer credit;
    @OneToOne(mappedBy = "course")
    private CourseMaterial courseMaterial;
}
