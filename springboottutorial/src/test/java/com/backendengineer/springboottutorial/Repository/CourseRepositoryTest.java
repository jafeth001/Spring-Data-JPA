package com.backendengineer.springboottutorial.Repository;

import com.backendengineer.springboottutorial.Entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;
    @Test
    public void getcourse(){
        List<Course> courseList = courseRepository.findAll();
        System.out.println("Course List "+courseList);
    }
}