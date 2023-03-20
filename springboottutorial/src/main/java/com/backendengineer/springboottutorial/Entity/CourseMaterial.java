package com.backendengineer.springboottutorial.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude="course")
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long materialid;
    private String url;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    //or FetchType.EAGER @OneToOne for print all course and course material

    @JoinColumn(name = "courseid",referencedColumnName = "courseid")
    private Course course;
}
