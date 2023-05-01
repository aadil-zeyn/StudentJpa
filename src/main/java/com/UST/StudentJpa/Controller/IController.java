package com.UST.StudentJpa.Controller;

import com.UST.StudentJpa.Model.Institute;
import com.UST.StudentJpa.Service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/institute")
public class IController {
    @Autowired
    private IService service;
    @PostMapping("/add")
    public Institute create(@RequestBody Institute institute){
        return service.create(institute);
    }
}
