package com.UST.StudentJpa.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String sid;
    private String name;
    private String email;
    private String phone;
    private String qualification;
    @ElementCollection
    private List<String> interestedCourse;
    private String address;
    private String comment;
}
