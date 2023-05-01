package com.UST.StudentJpa.Repository;

import com.UST.StudentJpa.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SRepository extends JpaRepository<Student,Integer> {
}
