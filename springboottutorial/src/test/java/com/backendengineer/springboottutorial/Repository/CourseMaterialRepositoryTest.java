package com.backendengineer.springboottutorial.Repository;

import com.backendengineer.springboottutorial.Entity.Course;
import com.backendengineer.springboottutorial.Entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository materialRepository;

    @Test
    public void savecoursematerial() {
        Course course = Course.builder()
                .title("Java")
                .credit(4)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.Java.com")
                .course(course)
                .build();
        materialRepository.save(courseMaterial);
    }
    @Test
    public void getcoursematerial(){
        List<CourseMaterial> materials = materialRepository.findAll();
        System.out.println("Course List "+materials);
    }
}