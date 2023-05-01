package com.UST.StudentJpa.Service;

import com.UST.StudentJpa.Model.Institute;
import com.UST.StudentJpa.Model.Student;
import com.UST.StudentJpa.Repository.SRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SService {
    @Autowired
    private SRepository repo;
    @Autowired
    private JPAStreamer jpaStreamer;
    public Student add(Student student) {
        return repo.save(student);
    }

    public Long count(String interestedCourse) {
        return jpaStreamer.stream(Student.class)
                .flatMap(student -> student.getInterestedCourse().stream())
                .filter(courses -> interestedCourse.contains(courses))
                .distinct()
                .count();
    }

    public List<Student> getname(String location) {
        return repo.findAll().stream()
                .filter(student -> student.getAddress().toLowerCase().contains(location.toLowerCase()))
                .collect(Collectors.toList());
    }


}
