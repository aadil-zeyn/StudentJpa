package com.UST.StudentJpa.Repository;

import com.UST.StudentJpa.Model.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends JpaRepository<Institute,Integer> {
}
