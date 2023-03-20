package com.backendengineer.springboottutorial.Repository;

import com.backendengineer.springboottutorial.Entity.Parent;
import com.backendengineer.springboottutorial.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentrepositoryTest {
    @Autowired
    private Studentrepository studentrepository;

    @Test
    public void saveStudent() {
        Parent parent = Parent.builder()
                .prtname("Juma")
                .prtemail("Juma@gmail.com")
                .build();
        Student student = Student.builder()
                .stdname("Jafeth")
                .stdemail("Jafeth@gmail.com")
                .parent(parent)
                .build();
        studentrepository.save(student);
    }

    @Test
    public void getstudent() {
        List<Student> student = studentrepository.findAll();
        System.out.println("StudentList " + student);
    }

    @Test
    public void getstudentbyid() {
        Student student = studentrepository.findById(1L).get();
        System.out.println("Student by id " + student);

    }
    @Test
    public void getstudentname() {
        List<Student> student = studentrepository.findByStdname("Adet");
        System.out.println("Student by name " + student);
    }
    @Test
    public void getstudentnamecontains() {
        List<Student> student = studentrepository.findByStdnameContains("Ad");
        System.out.println("Student by name " + student);
    }
    @Test
    public void getstudentemail() {
        List<Student> student = studentrepository.findByStdemail("Adet@gmail.com");
        System.out.println("Student by email " + student);
    }
}