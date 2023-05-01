package com.UST.StudentJpa.Service;

import com.UST.StudentJpa.Model.Institute;
import com.UST.StudentJpa.Repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IService {
    @Autowired
    private IRepository repo;
    public Institute create(Institute institute) {
        return repo.save(institute);
    }
}
