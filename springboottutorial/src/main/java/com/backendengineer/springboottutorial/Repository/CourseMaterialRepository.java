package com.backendengineer.springboottutorial.Repository;

import com.backendengineer.springboottutorial.Entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
}
