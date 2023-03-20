package com.backendengineer.springboottutorial.Repository;

import com.backendengineer.springboottutorial.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Studentrepository extends JpaRepository<Student, Long> {
    List<Student> findByStdname(String stdname);
    List<Student> findByStdnameContains(String stdname);
    List<Student> findByStdemail(String stdemail);
}
