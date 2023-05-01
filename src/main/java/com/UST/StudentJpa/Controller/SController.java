package com.UST.StudentJpa.Controller;

import com.UST.StudentJpa.Model.Student;
import com.UST.StudentJpa.Service.SService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class SController {
    @Autowired
    private SService service;

    @PostMapping("/add")
    public Student create(@RequestBody Student student){
        return service.add(student);
    }
    @GetMapping("/count/{course}")
    public Long countStudent(@PathVariable String course){
        return service.count(course);

    }

    @GetMapping("/{location}")
    public List<Student> getname(@PathVariable String location){
        return service.getname(location);
    }

}
